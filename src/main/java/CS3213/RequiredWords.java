package CS3213;

import java.util.HashSet;

public class RequiredWords {
    private HashSet<String> _requiredWords;
    private static RequiredWords _instance;
 
    private RequiredWords() {
        this._requiredWords = new HashSet<String>();
    }

    public static RequiredWords getRequiredWords() {
        if (_instance == null) {
            _instance = new RequiredWords();
        }

        return _instance;
    }

    public void addRequiredWords(String word) {
        assert(word != null);
        this._requiredWords.add(word.toLowerCase());
    }

    public void removeRequiredWord(String word) {
        assert(word != null);
        this._requiredWords.remove(word);
    }

    public boolean isRequiredWord(String word) {
        assert(word != null);
        return this._requiredWords.contains(word);
    }
    
    public boolean isRequiredWordsEmpty() {
    	return this._requiredWords == null || this._requiredWords.isEmpty();
    }
}