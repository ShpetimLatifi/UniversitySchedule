Code Report – Timescheduling Problem, a solution provided by a partial/customized Hill Climbing algorithm

Programi që e implementon Hill Climbing është I bazuar në MVC, dhe përmbanë gjithsej 6 klasë. Ky agoritëm, për shkak të mënyrës se si kemi
filluar t’i ruajmë të gjitha të dhënat, implementon algoritmin Hill Climbing, mirëpo pa një popullatë fillestare, pra në çdo hap shkon 
duke u mbushur java dhe duke kalkuluar fitness, dhe duke dhënë rezultatin më të mirë të mundshëm duke plotësuar “hard constraints”. 
3 Klasë janë klasë Modeluese ( klasët e lëndëve) të cilat njëkohësisht shërbejnë edhe si dataset, I cili është real, pasiqë është marrë 
nga Departamenti I Matematikës I fakultetit tonë. Klasa tjetër është klasë Controller, ku e kemi implementuar algoritmin “e pjesshëm 
Hill Climbing”. Klasa e fundit është klasë View, ku nëpërmjet një Maven dependency e kemi importuar një API në formën e .jar paketës e 
cila na mundëson manipulim me .xls files, ku përfshihet krijimi I një .xls file të ri, krijimi I sheets brena atij .xls, mbushja e çelive
me të dhëna, etj.

Arsyeja që I kemi përdorur Listat për këtë projekt është se e anë të Listave, përkatësisht implementimit të tyre ArrayListave, manipulimi 
me të dhëna ka qenë në përgjithësi më I lehtë, edhe pse ArrayListat kryejnë më shumë veprime sesa vargjet, ku rrjedhimisht janë më të 
ngadalta, për programin tonë nuk vërehet ndonjë dallim I madh për shkak të madhësisë së vogël të të dhënave dhe numrit relativisht të vogël
të manipulimeve me to.

CsSubjects – Klasë: Për drejtimin në fjalë I kemi krijuar 3 metoda për secalin vit akademik ku I kemi mbushur me emrat e profesorëve dhe
lëndëve të cilët I japin ata. Metodat kthejnë Listë të Stringjeve. Këtu në stringje I kemi shtuar edhe nga një K ose jo, varësisht se 
lënda a duhet të mbahet në një laborator me kompjuterë apo jo. Në fund Listat do të bëhen shuffle në mënyrë që algoritmi t’a marrë çfarëdo 
ligjërate dhe t’a vlerësojë se a përshtatet ajo klasë me sallën e marrë nga lista e sallave.

MfSubjects – Klasë: Për drejtimin në fjalë I kemi krijuar 3 metoda për secalin vit akademik ku I kemi mbushur me emrat e profesorëve dhe 
lëndëve të cilët I japin ata. Metodat kthejnë Listë të Stringjeve. Këtu në stringje I kemi shtuar edhe nga një K ose jo, varësisht se 
lënda a duhet të mbahet në një laborator me kompjuterë apo jo. Në fund Listat do të bëhen shuffle në mënyrë që algoritmi t’a marrë 
çfarëdo ligjërate dhe t’a vlerësojë se a përshtatet ajo klasë me sallën e marrë nga lista e sallave.

MSubjects – Klasë: Për drejtimin në fjalë I kemi krijuar 3 metoda për secalin vit akademik ku I kemi mbushur me emrat e profesorëve dhe 
lëndëve të cilët I japin ata. Metodat kthejnë Listë të Stringjeve. Këtu në stringje I kemi shtuar edhe nga një K ose jo, varësisht se 
lënda a duhet të mbahet në një laborator me kompjuterë apo jo. Në fund Listat do të bëhen shuffle në mënyrë që algoritmi t’a marrë 
çfarëdo ligjërate dhe t’a vlerësojë se a përshtatet ajo klasë me sallën e marrë nga lista e sallave.

Scheduler – Klasë: Klasa kryesore e cila implementon një algoritëm të modifikuar Hill Climbing. Në këtë klasë I kemi inicializur shumë 
instanca të Listave të Stringjeve për ditët e mësimit, klasët orët ,poashtu edhe Listave të Stringjeve për secilin vit akadekim të 
secilit drejtim, nga do I marrim të dhënat nga dataseti, do manipulojmë me to brenda metodës schedule në të cilën rezultatet do të
ruhen në tjera Lista të Stringjeve, e të gjitha këto sëbashku do të ruhen në variablat e fushës të cilat janë të inicializuara si Lista 
të Listave të Stringjeve.

Metoda sameProfessor – kthen vlerë Boolean, merr parameter List të Stringjeve të profesorëve, dhe Stringun të cilin do e kontrollojë se
a gjendet profesori I njëjtë në të njëjtën kohë edhe në një klasë tjetër.

Metoda schedule – kthen void, nuk merr parametër. Në këtë metodë është implementuar “fitnessi” në formën e if conditionals, ku do 
vërehet se në çdo hap të gjenerimit të orarit do të bëhen kontrollimi se a është fillimisht ajo ditë e lirë, pastaj ajo orë, krijohet 
një listë e re “temporary” e cla kopjon sallat origjinale, sepse do I pastaj do I largojmë sallat të cilat janë përdorur, dhe në fund 
nga një cikël for për secilin vit akademik të djretimit përkatës. Brenda një cikli for për një vit akademik të drejtimit specific 
kryhen hapat :
•	(Hard constraints) Fillimisht se a janë sallat e lira në atë kohë, ruan në një String një rezultat fillestar për atë kohë dhe atë drejtim për çfarëdo ligjërate të marrë nga dataseti
•	(Hard constraints) nëse klasa që është marrë mund të mbahet në sallën e  kompjuterëve  dhe sallat janë ende të papërdorura, merr një sallë të çfarëdoshme që I përshtatet llojit të ligjëratës, dhe bëje atë sallë të nxënë ( e largojmë nga lista e sallave të papërdorura). Poashtu e largojmë edhe atë ligjëratë që sapo është përdorur ( sapo është mbajtur).
•	Përndryshe nëse nuk mbahet në sallën e kompjuterëve, mbaje në sallat e tjera pa kompjuterë dhe kryej hapat e njëjtë.

Kështu do të veprohet nëpër secilin vit tjetër akademik të secilit drejtim përkatës, ku në fund të çdo dite që është përfunduar nga 
drejtimi specifik, ajo ditë do të largohet nga përdorimi, dhe do të mbushet të gjitha listat me ligjëratat përkatëse të tyre, dhe do të
kalojmë në ditën tjetër për drejtimin tjetër. Duke u “populate” java, ditët, orët, çdo herë e  më shumë programi do të bëjë më shumë 
kalkulime të fitnesit.
Në fund, në rezultatet finale të gjeneruara, në variablat e fushës resultCs, resultMf, dhe resultM (që janë Lista të Listave të 
Stringjeve), do I’u ndahen vlerat e gjeneruara si Lista të Stringjeve. Këto rezultate të fituara janë rezultatet që do I përdorim në 
klasën e fundit Generate, e cila është klasa View e MVC. 
Pasi e kemi importuar jexcelapi nëpërmjet Maven Dependencies, kemi pasqur çasje në manipulimin  e .xls files. Kemi ruajtur në 
inicializime të reja të Listave të Listave të Stringjeve nga rezultatet e fituara nga Scheduler.E kemi marrë nje file të zbrazët .xls I
cili do mbishkruhet me të dhëna gjithmonë kur ekzekutohet ky program. Për pamje I kemi vendosur në 3 çeli vetëm inicialet e emrave të 
drejtimeve specifike.
Me anë të for each cikleve, I kemi vendosur në çeli specifike rezultatet e krijuara nga Shceduler, the atë I kemi ndarë në rreshta të 
veçantë rezultatet për vitin e parë të studimeve, vitin e dytë dhe të tretë për secilin drejtim. Rezultati pas çdo iterimi shihet se 
ndërron për shkak të përdorimit të Collections.shuffle në klasët e datasetit.
Ne e kemi ndërruar mënyrën e krijimit të orarit, ku kemi menduar se do ishte më e logjikshme sikur një drejtim do mund ta përfundonte 
orarin e tij brenda një dite, që ditët e tjera të jenë të lira. 
Për shkak të kompleksitetit të problemit dhe faktit që ky është kryesisht vetëm një “school assignment”, ka qenë e nevojshme t’I
largojmë disa nga kushtet e kërkesës së detyrës, duke filluar nga fakti se është dashur t’I largojmë orët e ushtrimeve, pra I kemi 
lënë vetëm ligjëratat. Poashtu I kemi përjashtuar të gjitha soft constraints, edhe pse idea fillestare ishte që në nested for-s, 
randomly të zgjidhet një kusht nga lista e soft constraints dhe ai të plotësohet, mirëpo kjo do shfaqte më shumë probleme në gjenerimin 
e pjesës tjetër të projektit. Si pjesë e punës në të ardhmen, kemi menduar që patjetër t’I përfshijmë të gjitha ato karakteristika që I
mungojnë programit, dhe poashtu t’i ndajmë drejtimet nëpër ditë të ndryshme, dhe njëkohësisht ta implementojmë algoritmin Hill Climbing
me një popullatë fillestare, dhe fitnessin ta njehsojmë ndamas me anë të një metode e cila do kthente rezultatin e dëshiruar.

https://drive.google.com/file/d/1Pfo1DGhsEU8edr4wqqp7jkAjD4nriAkD/view?usp=sharing
