package calculator.business;

import calculator.entities.Language;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

import java.util.HashMap;

public class TranslatorImpl implements Translator {
    private Translate translateService = TranslateOptions.getDefaultInstance().getService();
    private HashMap<String, String> cache = new HashMap<>();

    @Override
    public String translate(Language from, Language to, String text) {
        String key = from.getId() + to.getId() + text;
        if (cache.containsKey(key)) {
            return cache.get(from.getId());
        }

        Translation translation = translateService.translate(text, Translate.TranslateOption.sourceLanguage(from.getId()), Translate.TranslateOption.targetLanguage(to.getId()));
        cache.put(key, translation.getTranslatedText());

        return translation.getTranslatedText();
    }
}
