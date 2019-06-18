import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MSubjects {

    public List<String> firstYear() {
        List<String> subjects = new ArrayList<>();
        subjects.add("R.Zejnullahu - Analiza Matematike II");
        subjects.add("Q.Haxhibeqiri - Gjeometria analitike II");
        subjects.add("A.Shabani - Algjebra lineare I");
        subjects.add("F.Berisha - Programim dhe algoritme K");
        subjects.add("N.Braha - Bazat e punës me kompjuter K");
        subjects.add("G.Bujupi - Gjuha Angleze II ");
        Collections.shuffle(subjects);
        return subjects;
    }

    public List<String> secondYear() {
        List<String> subjects = new ArrayList<>();
        subjects.add("M.Lohaj - Analiza Matematike IV");
        subjects.add("M.Gashi - Teori e polinomeve");
        subjects.add("B.Fejzullahu - Teori e gjasës");
        subjects.add("M.Gashi - Gjeometri deskriptive");
        subjects.add("A.Berisha - Bazat e të dhënave K");
        Collections.shuffle(subjects);
        return subjects;
    }

    public List<String> thirdYear() {
        List<String> subjects = new ArrayList<>();
        subjects.add("B.Fejzullahu - Analizë komplekse");
        subjects.add("M.Lohaj - Hapësirat vektoriale");
        subjects.add("S.Avdihaj - Fizika");
        subjects.add("M.Lohaj - Transformimet e Laplasit");
        Collections.shuffle(subjects);
        return subjects;
    }
}
