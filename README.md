# Übung 2

**Hinweise:**

In dieser Übung verwenden wir GitLab um Deployment Pipelines zu entwickeln. Die Prinzipien lassen sich jedoch auch mit anderen CI/CD Diensten entwickeln. GitLab kann entweder auf dem lokalen Rechner installiert werden oder in der Cloud verwendet werden, indem man auf [GitLab.com](http://www.gitlab.com) kostenlos einen Account anlegt. Das Anlegen eines Accounts für diese Übung ist natürlich freiwillig. Anmerkung: Das 30-day-trial bezieht sich nur auf die Ultimate-Variante, alle anderen Dienste können auch darüber hinaus genutzt werden.

Jede der folgenden Aufgaben sollte in einem eigenen Projekt realisiert werden. Wie man Projekte in GitLab anlegt, wird in der Vorlesung noch erklärt.  

Zunächst einmal können Sie das Repository zu Übung 2 über git klonen.  

In diesem Repository finden sie Konfigurationsdateien in YAML, die nach folgendem Schema aufgebaut sind:

   ```bash
aufgabe_n.yml
   ```
Das n ist jeweils eine Ziffer (1,2,3, ...), welche die zugehörige Aufgabe referenziert. Um die Datei in dem jeweiligen Projekt/Repository nutzen zu können, müssen Sie sie folgendermaßen umbenennen:

   ```bash
.gitlab-ci.yml
   ```

**Aufgabe 1 - Eine einfache Deployment-Pipeline**

Legen Sie ein neues Projekt in GitLab an (z.B. aufgabe1). Fügen Sie dem Projekt-Repository den Code aus der Datei aufgabe_1.yml hinzu und speichern Sie ihn unter dem Dateinamen .gitlab-ci.yml (siehe Hinweise oben).  

Comitten Sie die Änderungen und starten Sie die Pipeline.  

Schauen Sie sich die grafische Darstellung der Pipeline sowie ihren Konsolen-Output an.  

Die Pipeline sollte so aussehen:  

![aufgabe1pipeline.png](aufgabe1pipeline.png)

a) Wie lange benötigt der Durchlauf dieser Pipeline theoretisch?  

b) Wie lange benötigt der Durchlauf dieser Pipeline tatsächlich?

**Aufgabe 2 - Fehler in Deployment-Pipelines**

Ändern Sie job3 so, dass dieser fehlschlägt und somit die Pipeline abgebrochen wird.

**Aufgabe 3 - Deployment-Pipeline als Directed Acyclic Graph (DAG)**

Ändern Sie die Pipeline aus Aufgabe 1 so, dass job3 bereits dann starten kann, wenn job1 beendet wurde (unabhängig von job2).

a) Wie lange benötigt der Durchlauf dieser Pipeline theoretisch?  

b) Wie lange benötigt der Durchlauf dieser Pipeline tatsächlich?

**Aufgabe 4 - Artifacts**

Artefakte sind in Deployment-Pipelines Job-Erzeugnisse, die entlang einer Stage-Sequenz weitergereicht werden sollen. Zum Beispiel kann dies bei einem Java-Programm zunächst eine .class Datei sein, die nach einem Build-Job an einen Test-Job weitergereicht wird und zum Ende der Pipeline als .jar Datei ausgegeben werden soll. Diese Artefakte müssen explizit in der Konfigurationsdatei der Pipeline definiert werden.  

Legen Sie zunächst ein neues Projekt/Repository für diese Aufgabe an. Fügen Sie dem Repository den Code aus der Datei aufgabe_4.yml als .gitlab-ci.yml Datei hinzu (siehe Hinweise oben).

a) Führen Sie die Pipeline aus und sehen Sie danach unter "Artifacts" nach, welche Dateien die Pipeline erzeugt hat.  

b) Warum wird für job2 keine Datei angelegt?

c) Ändern Sie die Konfigurationsdatei so, dass auch für job2 die entsprechende Datei erzeugt wird.

**Aufgabe 4 - Branches und Umgebungsvariablen**

GitLab hat eine ganze Reihe von Umgebungsvariablen um die Entwicklung in verschiedenen Branches zu steuern. So kann man z. B. steuern, dass ein Build auf dem Master-Branch in die Produktionsumgebung deployt wird, ein Build auf dem Release-Branch in die Staging-Umgebung und alle anderen Branches nur in die Test-Umgebung.

Legen Sie zunächst ein neues Projekt/Repository für diese Aufgabe an. Fügen Sie dem Repository den Code aus der Datei aufgabe_5.yml als .gitlab-ci.yml Datei hinzu (siehe Hinweise oben).

Legen Sie folgende Branches in ihrem Projekt an:  

- feature  

- master  

- release

a) Führen Sie die Pipeline in den unterschiedlichen Branches aus und sehen Sie sich das Ergebnis an.  

b) Ändern Sie die Pipeline so, dass job1 nur im feature Branch ausgeführt wird.


**Aufgabe 0 - Aufwärmübung mit der Kommandozeile**

Im cloud-nativen Umfeld arbeitet man häufig mit der Kommandozeile. Deshalb machen wir eine kurze Aufwärmübung dazu. Erledigen Sie folgende Aufgaben ausschließlich über die Kommandozeile:

a) Öffnen Sie ein Terminal  
b) Lassen Sie sich den absoluten Pfad des Verzeichnisses anzeigen, in dem Sie gerade arbeiten  
c) Wechseln Sie in eine Verzeichnis ihrer Wahl  
d) Gehen Sie ein Verzeichnis nach oben im Verzeichnispfad  
e) Gehen Sie ein Verzeichnis nach unten im Verzeichnispfad  
f) Legen Sie dort ein Verzeichnis namens CloudComputing an  
g) Legen Sie in diesem Verzeichnis eine Datei namens server.log an  
h) Lassen Sie sich alle Dateien im Verzeichnis CloudComputing anzeigen  
i) Löschen Sie die Datei server.log  
j) Löschen Sie das Verzeichnis CloudComputing (oder behalten Sie es, um dort alle weiteren Materialen zur Vorlesungen und zu den Übungen abzulegen)  
k) Lassen Sie sich alle Prozesse anzeigen die gerade laufen  
l) Beenden Sie ihren Terminal-Prozess  


**Aufgabe 1 - Repository Klonen**

Um Repositories zu klonen, sollten Sie zunächst [git](https://git-scm.com/book/de/v2/Erste-Schritte-Git-installieren) installieren (das geht auch über die Kommandozeile). Sie können dann dieses Repository klonen mit:

   ```bash
git clone https://github.com/THN-Cloud-native-Computing/cnc-uebung1
   ```


**Aufgabe 2 – Workload-Analyse**

In der zu dieser Übung ebenfalls bereitgestellten Excel-Tabelle Demands.xlsx sind 7 Services mit ihren Demands (im zeitlichen Verlauf von oben nach unten in der jeweiligen Spalte) dargestellt. Pro Zelle ist die Anzahl der Ressourceneinheiten (vCPUs) angegeben, welche pro Zeiteinheit (Stunde) genutzt werden.
Stellen Sie die Services jeweils grafisch dar und ordnen Sie sie dem jeweiligen Workload-Typ aus der Vorlesung zu.

**Aufgabe 3 – Peak-to-Average-Ratio**

Berechnen Sie für jeden Service aus Übung 1 das Peak-to-Average Ratio.

**Aufgabe 4 – Cloud-Kosten und das Peak-to-Average-Ratio**

Im Folgenden werden die Kosten (in €) einer vCPU für eine Cloud-Ressource c und eine On-premise-Ressource d betrachtet. Bestimmen Sie für die folgenden Kostenverhältnisse, welcher der Services sich für eine Cloud-Lösung eignet:

| Nr.  | c  | d  |
|:----------|:----------|:----------|
| a)    | 1,0    | 1,0    |
| b)    | 1,5    | 1,0   |
| c)    | 1,7    | 1,0   |
| d)    | 2,0    | 1,0   |
| e)    | 1,0    | 1,01   |
| f)    | 1,0    | 2,0   |
| g)    | 5,0    | 1,0    |
| h)    | 19,0    | 1,0    |
| i)    | 20,0    | 1,0    |



**Aufgabe 5 – Kosten für IaaS, PaaS und SaaS**

Wir betrachten nun den Fall, dass wir die Services aus Übung 1 entweder On-Premise betreiben, oder durch eine IaaS, PaaS oder SaaS Lösung (mit unterschiedlichen Kosten) realisieren. Für die On-Premise-Lösung seien Kosten von 1€ pro Ressource und Zeiteinheit angenommen. In der folgenden Tabelle sind Kosten-Staffelungen der IaaS-, PaaS- und SaaS-Dienste verschiedener Anbieter gelistet. Welcher Service wäre in welcher Variante bei welchem Anbieter am wirtschaftlichsten?

| Anbieter  | c(IaaS)  | c(PaaS)  | c(SaaS)  |
|:----------|:----------|:----------|:----------|
| 1    | 1,0    | 2,0    | 3,0   |
| 2    | 3,0    | 5,0    | 7,0    |
| 3    | 1,0    | 1,1    | 1,2    |
| 4    | 1,0    | 1,3    | 1,8    |
| 5    | 0,8    | 1,1    | 1,2    |
| 6    | 0,8    | 0,9    | 1,1    |
