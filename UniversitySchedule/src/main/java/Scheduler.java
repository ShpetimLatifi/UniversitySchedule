import java.util.*;

@SuppressWarnings("ALL")
public class Scheduler {

    List<String> sallat = Arrays.asList("112", "113", "114", "153");
    List<String> sallatK = Arrays.asList("Lab M K", "Lab V K", "Lab B K");

    List<String> days = new ArrayList<>(Arrays.asList("H", "M", "Me", "E", "P"));
    List<String> hours = Arrays.asList("08:00~09:30", "09:45~11:15", "11:30~13:00", "13:15~14:45", "15:00~16:30");

    List<List<String>> resultCs = new ArrayList<>();
    List<List<String>> resultMf = new ArrayList<>();
    List<List<String>> resultMt = new ArrayList<>();
    CsSubjects cs = new CsSubjects();
    MfSubjects mf = new MfSubjects();
    MSubjects mt = new MSubjects();
    List<String> firstYearCs = cs.firstYear();
    List<String> firstYearMf = mf.firstYear();
    List<String> firstYearM = mt.firstYear();
    List<String> secondYearCs = cs.secondYear();
    List<String> secondYearMf = mf.secondYear();
    List<String> secondYearM = mt.secondYear();
    List<String> thirdYearCs = cs.thirdYear();
    List<String> thirdYearMf = mf.thirdYear();
    List<String> thirdYearM = mt.thirdYear();

    List<List<String>> CS = new ArrayList<>();
    List<List<String>> MAT = new ArrayList<>();
    List<List<String>> MF = new ArrayList<>();

    private boolean sameProfessor(List<String> p1, String p2) {
        List<String> professors = new ArrayList<>();
        for (String prof : p1) {
            int i = prof.indexOf("-");
            String substring = prof.substring(0, i);
            professors.add(substring);
        }
        return professors.contains(p2);

    }

    public void schedule() {


        List<String> firstYearCsSchedule = new ArrayList<>();
        List<String> secondYearCsSchedule = new ArrayList<>();
        List<String> thirdYearCsSchedule = new ArrayList<>();
        List<String> firstYearMfSchedule = new ArrayList<>();
        List<String> secondYearMfSchedule = new ArrayList<>();
        List<String> thirdYearMfSchedule = new ArrayList<>();
        List<String> firstYearMatSchedule = new ArrayList<>();
        List<String> secondYearMatSchedule = new ArrayList<>();
        List<String> thirdYearMatSchedule = new ArrayList<>();

        for (int i = 0; i < days.size(); i++) {
            for (int j = 0; j < hours.size(); j++) {
                List<String> tempSallatK = new ArrayList<>();
                tempSallatK.addAll(sallatK);
                List<String> tempSallat = new ArrayList<>();
                tempSallat.addAll(sallat);
                for (int k = 0; k < firstYearCs.size(); k++) {
                    if (tempSallat.size() == 0 && tempSallatK.size() == 0) {
                        break;
                    }
                    String firstYearAndHour = days.get(i) + " " + hours.get(j) + " " + firstYearCs.get(k);

                    if (sameProfessor(firstYearCsSchedule, firstYearAndHour)) {
                        continue;
                    }

                    if (firstYearCs.get(k).charAt(firstYearCs.get(k).length() - 1) == 'K' && tempSallatK.size() != 0) {
                        Random r = new Random(tempSallatK.size());
                        int z = r.nextInt(tempSallatK.size());
                        firstYearCsSchedule.add(days.get(i) + " " + "Viti 1: " + hours.get(j) + " " + firstYearCs.get(k) + " " + tempSallatK.get(Math.abs(z)));
                        tempSallatK.remove(z);
                        firstYearCs.remove(firstYearCs.get(k));
                    } else {
                        if (tempSallat.size() != 0) {
                            Random r = new Random(tempSallat.size());
                            int z = r.nextInt(tempSallat.size());
                            firstYearCsSchedule.add(days.get(i) + " " + "Viti 1: " + hours.get(j) + " " + firstYearCs.get(k) + " " + tempSallat.get(Math.abs(z)));
                            tempSallat.remove(z);
                            firstYearCs.remove(firstYearCs.get(k));
                        }
                    }

                }
                for (int k = 0; k < secondYearCs.size(); k++) {
                    if (tempSallat.size() == 0 && tempSallatK.size() == 0) {
                        break;
                    }
                    String secondYearAndHour = days.get(i) + " " + hours.get(j) + " " + secondYearCs.get(k);

                    if (sameProfessor(secondYearCsSchedule, secondYearAndHour)) {
                        continue;
                    }

                    if (secondYearCs.get(k).charAt(secondYearCs.get(k).length() - 1) == 'K' && tempSallatK.size() != 0) {
                        Random r = new Random(tempSallatK.size());
                        int z = r.nextInt(tempSallatK.size());
                        secondYearCsSchedule.add(days.get(i) + " " + "Viti 2: " + hours.get(j) + " " + secondYearCs.get(k) + " " + tempSallatK.get(Math.abs(z)));
                        tempSallatK.remove(z);
                        secondYearCs.remove(secondYearCs.get(k));
                    } else {
                        if (tempSallat.size() != 0) {
                            Random r = new Random(tempSallat.size());
                            int z = r.nextInt(tempSallat.size());
                            secondYearCsSchedule.add(days.get(i) + " " + "Viti 2: " + hours.get(j) + " " + secondYearCs.get(k) + " " + tempSallat.get(Math.abs(z)));
                            tempSallat.remove(z);
                            secondYearCs.remove(secondYearCs.get(k));
                        }
                    }
                }
                for (int k = 0; k < thirdYearCs.size(); k++) {
                    if (tempSallat.size() == 0 && tempSallatK.size() == 0) {
                        break;
                    }
                    String thirdYearAndHour = days.get(i) + " " + hours.get(j) + " " + thirdYearCs.get(k);

                    if (sameProfessor(thirdYearCsSchedule, thirdYearAndHour)) {
                        continue;
                    }

                    if (thirdYearCs.get(k).charAt(thirdYearCs.get(k).length() - 1) == 'K' && tempSallatK.size() != 0) {
                        Random r = new Random(tempSallatK.size());
                        int z = r.nextInt(tempSallatK.size());
                        thirdYearCsSchedule.add(days.get(i) + " " + "Viti 3: " + hours.get(j) + " " + thirdYearCs.get(k) + " " + tempSallatK.get(Math.abs(z)));
                        tempSallatK.remove(z);
                        thirdYearCs.remove(thirdYearCs.get(k));
                    } else {
                        if (tempSallat.size() != 0) {
                            Random r = new Random(tempSallat.size());
                            int z = r.nextInt(tempSallat.size());
                            thirdYearCsSchedule.add(days.get(i) + " " + "Viti 3: " + hours.get(j) + " " + thirdYearCs.get(k) + " " + tempSallat.get(Math.abs(z)));
                            tempSallat.remove(z);
                            thirdYearCs.remove(thirdYearCs.get(k));
                        }
                    }
                }
            }
            days.remove(days.get(i));
            if (firstYearCs.size() == 0 && secondYearCs.size() == 0 && thirdYearCs.size() == 0) {
                break;
            }
        }
        for (int i = 0; i < days.size(); i++) {
            for (int j = 0; j < hours.size(); j++) {
                List<String> tempSallatK = new ArrayList<>();
                tempSallatK.addAll(sallatK);
                List<String> tempSallat = new ArrayList<>();
                tempSallat.addAll(sallat);
                for (int k = 0; k < firstYearM.size(); k++) {
                    if (tempSallat.size() == 0 && tempSallatK.size() == 0) {
                        break;
                    }
                    String firstYearAndHour = days.get(i) + " " + hours.get(j) + " " + firstYearM.get(k);

                    if (sameProfessor(firstYearMatSchedule, firstYearAndHour)) {
                        continue;
                    }

                    if (firstYearM.get(k).charAt(firstYearM.get(k).length() - 1) == 'K' && tempSallatK.size() != 0) {
                        Random r = new Random(tempSallatK.size());
                        int z = r.nextInt(tempSallatK.size());
                        firstYearMatSchedule.add(days.get(i) + " " + "Viti 1: " + hours.get(j) + " " + firstYearM.get(k) + " " + tempSallatK.get(Math.abs(z)));
                        tempSallatK.remove(z);
                        firstYearM.remove(firstYearM.get(k));
                    } else {
                        if (tempSallat.size() != 0) {
                            Random r = new Random(tempSallat.size());
                            int z = r.nextInt(tempSallat.size());
                            firstYearMatSchedule.add(days.get(i) + " " + "Viti 1: " + hours.get(j) + " " + firstYearM.get(k) + " " + tempSallat.get(Math.abs(z)));
                            tempSallat.remove(z);
                            firstYearM.remove(firstYearM.get(k));
                        }
                    }

                }
                for (int k = 0; k < secondYearM.size(); k++) {
                    if (tempSallat.size() == 0 && tempSallatK.size() == 0) {
                        break;
                    }
                    String secondYearAndHour = days.get(i) + " " + hours.get(j) + " " + secondYearM.get(k);

                    if (sameProfessor(secondYearMatSchedule, secondYearAndHour)) {
                        continue;
                    }

                    if (secondYearM.get(k).charAt(secondYearM.get(k).length() - 1) == 'K' && tempSallatK.size() != 0) {
                        Random r = new Random(tempSallatK.size());
                        int z = r.nextInt(tempSallatK.size());
                        secondYearMatSchedule.add(days.get(i) + " " + "Viti 2: " + hours.get(j) + " " + secondYearM.get(k) + " " + tempSallatK.get(Math.abs(z)));
                        tempSallatK.remove(z);
                        secondYearM.remove(secondYearM.get(k));
                    } else {
                        if (tempSallat.size() != 0) {
                            Random r = new Random(tempSallat.size());
                            int z = r.nextInt(tempSallat.size());
                            secondYearMatSchedule.add(days.get(i) + " " + "Viti 2: " + hours.get(j) + " " + secondYearM.get(k) + " " + tempSallat.get(Math.abs(z)));
                            tempSallat.remove(z);
                            secondYearM.remove(secondYearM.get(k));
                        }
                    }
                }
                for (int k = 0; k < thirdYearM.size(); k++) {
                    if (tempSallat.size() == 0 && tempSallatK.size() == 0) {
                        break;
                    }
                    String thirdYearAndHour = days.get(i) + " " + hours.get(j) + " " + thirdYearM.get(k);

                    if (sameProfessor(thirdYearMatSchedule, thirdYearAndHour)) {
                        continue;
                    }

                    if (thirdYearM.get(k).charAt(thirdYearM.get(k).length() - 1) == 'K' && tempSallatK.size() != 0) {
                        Random r = new Random(tempSallatK.size());
                        int z = r.nextInt(tempSallatK.size());
                        thirdYearMatSchedule.add(days.get(i) + " " + "Viti 3: " + hours.get(j) + " " + thirdYearM.get(k) + " " + tempSallatK.get(Math.abs(z)));
                        tempSallatK.remove(z);
                        thirdYearM.remove(thirdYearM.get(k));
                    } else {
                        if (tempSallat.size() != 0) {
                            Random r = new Random(tempSallat.size());
                            int z = r.nextInt(tempSallat.size());
                            thirdYearMatSchedule.add(days.get(i) + " " + "Viti 3: " + hours.get(j) + " " + thirdYearM.get(k) + " " + tempSallat.get(Math.abs(z)));
                            tempSallat.remove(z);
                            thirdYearM.remove(thirdYearM.get(k));
                        }
                    }
                }
            }
            days.remove(days.get(i));
            if (firstYearM.size() == 0 && secondYearM.size() == 0 && thirdYearM.size() == 0) {
                break;
            }
        }
        for (int i = 0; i < days.size(); i++) {
            for (int j = 0; j < hours.size(); j++) {
                List<String> tempSallatK = new ArrayList<>();
                tempSallatK.addAll(sallatK);
                List<String> tempSallat = new ArrayList<>();
                tempSallat.addAll(sallat);
                for (int k = 0; k < firstYearMf.size(); k++) {
                    if (tempSallat.size() == 0 && tempSallatK.size() == 0) {
                        break;
                    }
                    String firstYearAndHour = days.get(i) + " " + hours.get(j) + " " + firstYearMf.get(k);

                    if (sameProfessor(firstYearMfSchedule, firstYearAndHour)) {
                        continue;
                    }

                    if (firstYearMf.get(k).charAt(firstYearMf.get(k).length() - 1) == 'K' && tempSallatK.size() != 0) {
                        Random r = new Random(tempSallatK.size());
                        int z = r.nextInt(tempSallatK.size());
                        firstYearMfSchedule.add(days.get(i) + " " + "Viti 1: " + hours.get(j) + " " + firstYearMf.get(k) + " " + tempSallatK.get(Math.abs(z)));
                        tempSallatK.remove(z);
                        firstYearMf.remove(firstYearMf.get(k));
                    } else {
                        if (tempSallat.size() != 0) {
                            Random r = new Random(tempSallat.size());
                            int z = r.nextInt(tempSallat.size());
                            firstYearMfSchedule.add(days.get(i) + " " + "Viti 1: " + hours.get(j) + " " + firstYearMf.get(k) + " " + tempSallat.get(Math.abs(z)));
                            tempSallat.remove(z);
                            firstYearMf.remove(firstYearMf.get(k));
                        }
                    }

                }
                for (int k = 0; k < secondYearMf.size(); k++) {
                    if (tempSallat.size() == 0 && tempSallatK.size() == 0) {
                        break;
                    }
                    String secondYearAndHour = days.get(i) + " " + hours.get(j) + " " + secondYearMf.get(k);

                    if (sameProfessor(secondYearMfSchedule, secondYearAndHour)) {
                        continue;
                    }

                    if (secondYearMf.get(k).charAt(secondYearMf.get(k).length() - 1) == 'K' && tempSallatK.size() != 0) {
                        Random r = new Random(tempSallatK.size());
                        int z = r.nextInt(tempSallatK.size());
                        secondYearMfSchedule.add(days.get(i) + " " + "Viti 2: " + hours.get(j) + " " + secondYearMf.get(k) + " " + tempSallatK.get(Math.abs(z)));
                        tempSallatK.remove(z);
                        secondYearMf.remove(secondYearMf.get(k));
                    } else {
                        if (tempSallat.size() != 0) {
                            Random r = new Random(tempSallat.size());
                            int z = r.nextInt(tempSallat.size());
                            secondYearMfSchedule.add(days.get(i) + " " + "Viti 2: " + hours.get(j) + " " + secondYearMf.get(k) + " " + tempSallat.get(Math.abs(z)));
                            tempSallat.remove(z);
                            secondYearMf.remove(secondYearMf.get(k));
                        }
                    }
                }
                for (int k = 0; k < thirdYearMf.size(); k++) {
                    if (tempSallat.size() == 0 && tempSallatK.size() == 0) {
                        break;
                    }
                    String thirdYearAndHour = days.get(i) + " " + hours.get(j) + " " + thirdYearMf.get(k);

                    if (sameProfessor(thirdYearMfSchedule, thirdYearAndHour)) {
                        continue;
                    }

                    if (thirdYearMf.get(k).charAt(thirdYearMf.get(k).length() - 1) == 'K' && tempSallatK.size() != 0) {
                        Random r = new Random(tempSallatK.size());
                        int z = r.nextInt(tempSallatK.size());
                        thirdYearMatSchedule.add(days.get(i) + " " + "Viti 3: " + hours.get(j) + " " + thirdYearMf.get(k) + " " + tempSallatK.get(Math.abs(z)));
                        tempSallatK.remove(z);
                        thirdYearMf.remove(thirdYearMf.get(k));
                    } else {
                        if (tempSallat.size() != 0) {
                            Random r = new Random(tempSallat.size());
                            int z = r.nextInt(tempSallat.size());
                            thirdYearMfSchedule.add(days.get(i) + " " + "Viti 3: " + hours.get(j) + " " + thirdYearMf.get(k) + " " + tempSallat.get(Math.abs(z)));
                            tempSallat.remove(z);
                            thirdYearMf.remove(thirdYearMf.get(k));
                        }
                    }
                }
            }
            days.remove(days.get(i));
            if (firstYearMf.size() == 0 && secondYearMf.size() == 0 && thirdYearMf.size() == 0) {
                break;
            }
        }
        resultCs.add(firstYearCsSchedule);
        resultCs.add(secondYearCsSchedule);
        resultCs.add(thirdYearCsSchedule);
        resultMf.add(firstYearMfSchedule);
        resultMf.add(secondYearMfSchedule);
        resultMf.add(thirdYearMfSchedule);
        resultMt.add(firstYearMatSchedule);
        resultMt.add(secondYearMatSchedule);
        resultMt.add(thirdYearMatSchedule);
    }

}
