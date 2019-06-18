import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CsSubjects {

    public List<String> firstYear() {
        List<String> subjects = new ArrayList<>();
        subjects.add("N.Braha - Analize Matematike 1");
        subjects.add("A.Shabani - Algjebër lineare me Gjeometri analitike");
        subjects.add("E.Bytyqi - Strukturat e të dhënave K");
        subjects.add("E.Bajrami - Rrjetat kompjuterike dhe WWW K");
        subjects.add("N.Braha - Aplikacione Kompjuterike I K");
        subjects.add("G.Bujupaj - Gjuha Angleze II");
        Collections.shuffle(subjects);
        return subjects;
    }

    public List<String> secondYear() {
        List<String> subjects = new ArrayList<>();
        subjects.add("F.Berisha - Analizë numerike II");
        subjects.add("B.Fejzullahu - Teoria e Gjasës");
        subjects.add("F.Berisha - Programimi OOP dhe GUI K");
        subjects.add("M.Lohaj - Teoria e matricave");
        subjects.add("A.Berisha - Grafika kompjuterike K");
        subjects.add("E.Bytyqi -Intelegjenca Artificiale K");
        Collections.shuffle(subjects);
        return subjects;
    }

    public List<String> thirdYear() {
        List<String> subjects = new ArrayList<>();
        subjects.add("E.Rogova - Programim i Distribuar K");
        subjects.add("A.Berisha - Procesimi i imazheve K");
        subjects.add("E.Rogova - Inxhinierimi i softuerit K");
        subjects.add("E.Rogova - Biznesi dhe Interneti");
        subjects.add("F.Merovci - Proceset Stokastike");
        Collections.shuffle(subjects);
        return subjects;
    }


}
