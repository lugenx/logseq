(ns frontend.dicts.sk
  "Provides translation to SK"
  #?(:cljs (:require [shadow.resource :as rc])))

(def ^:large-vars/data-var dicts
  {:accessibility/skip-to-main-content               "Preskočiť na hlavný obsah"
   :tutorial/text                                    #?(:cljs    (rc/inline "tutorial-sk.md")
                                                        :default "tutorial-sk.md")
   :tutorial/dummy-notes                             #?(:cljs    (rc/inline "dummy-notes-sk.md")
                                                        :default "dummy-notes-sk.md")
   :on-boarding/demo-graph                           "Toto je ukážkový graf, zmeny nebudú uložené, kým neotvoríte lokálny adresár."
   :on-boarding/add-graph                            "Pridať graf"
   :on-boarding/open-local-dir                       "Otvoriť lokálny adresár"
   :on-boarding/new-graph-desc-1                     "Logseq podporuje Markdown aj Org mode. Na svojom zariadení môžete otvoriť existujúci adresár alebo vytvoriť nový. Adresár sa tiež nazýva jednoducho priečinok. Vaše údaje budú uložené iba na tomto zariadení."
   :on-boarding/new-graph-desc-2                     "Po otvorení adresára sa v ňom vytvoria tri podadresáre:"
   :on-boarding/new-graph-desc-3                     "/journals - sem sa ukladajú stránky z denníka"
   :on-boarding/new-graph-desc-4                     "/pages - sem sa ukladajú ostatné stránky"
   :on-boarding/new-graph-desc-5                     "/logseq - sem sa ukladá konfigurácia, custom.css a nejaké metadata"
   :on-boarding/welcome-whiteboard-modal-title       "Nové plátno pre vaše myšlienky."
   :on-boarding/welcome-whiteboard-modal-description "Tabule sú skvelým nástrojom na brainstorming a organizáciu. Odteraz môžete svoje ľubovoľné myšlienky umiestniť na priestorové plátno tak, aby ste ich mohli spájať a chápať novými spôsobmi."
   :on-boarding/welcome-whiteboard-modal-skip        "Preskočiť"
   :on-boarding/welcome-whiteboard-modal-start       "Spustiť "
   :on-boarding/tour-whiteboard-home                 "{1} Domov pre vaše tabule"
   :on-boarding/tour-whiteboard-home-description     "Tabule majú v aplikácii svoju vlastnú sekciu, kde si ich môžete jednoducho prehliadať, vytvárať nové alebo ich ľahko vymazať."
   :on-boarding/tour-whiteboard-new                  "{1} Vytvoriť novú tabuľu"
   :on-boarding/tour-whiteboard-new-description      "Existuje niekoľko spôsobov, ako vytvoriť novú tabuľu. Jeden z nich je vždy priamo tu na ovládacom paneli."
   :help/start                                       "Začíname"
   :help/about                                       "O Logseq"
   :help/roadmap                                     "Plán vývoja"
   :help/bug                                         "Nahlásiť chybu"
   :help/feature                                     "Požadovať novú funkciu"
   :help/changelog                                   "Prehľad zmien"
   :help/docs                                        "Dokumentácia"
   :help/privacy                                     "Zásady ochrany osobných údajov"
   :help/terms                                       "Podmineky používania"
   :help/forum-community                             "Komunitné fórum"
   :help/shortcuts                                   "Klávesové skratky"
   :help/shortcuts-triggers                          "Akcie"
   :help/shortcut                                    "Skratky"
   :help/slash-autocomplete                          "Automatické dopĺňanie s lomítkom"
   :help/block-content-autocomplete                  "Automatické dopĺňanie obsahu bloku"
   :help/reference-autocomplete                      "Automatické dopĺňanie referencie na stránku"
   :help/block-reference                             "Referencia na blok"
   :help/open-link-in-sidebar                        "Otvoriť odkaz v bočnom paneli"
   :more                                             "Viac"
   :search/result-for                                "Vyhľadať výsledok pre "
   :search/items                                     "položky"
   :search/page-names                                "Hľadať názvy stránok"
   :search-item/whiteboard                           "Tabuľa"
   :search-item/page                                 "Stránka"
   :search-item/file                                 "Súbor"
   :search-item/block                                "Blok"
   :help/context-menu                                "Kontextové menu bloku"
   :bold                                             "Tučné"
   :italics                                          "Kurzíva"
   :highlight                                        "Zvýrazniť"
   :strikethrough                                    "Prečiarknuté"
   :code                                             "Kód"
   :untitled                                         "Bez názvu"
   :right-side-bar/help                              "Pomoc"
   :right-side-bar/switch-theme                      "Motívy"
   :right-side-bar/contents                          "Obsah"
   :right-side-bar/page-graph                        "Graf stránok"
   :right-side-bar/block-ref                         "Referencie bloku"
   :right-side-bar/graph-view                        "Zobrazenie grafu"
   :right-side-bar/all-pages                         "Všetky stránky"
   :right-side-bar/whiteboards                       "Tabule"
   :right-side-bar/flashcards                        "Kartičky"
   :right-side-bar/new-page                          "Nová stránka"
   :right-side-bar/show-journals                     "Zobraziť denníky"
   :right-side-bar/separator                         "Nástroj na zmenu veľkosti pravého bočného panelu"
   :left-side-bar/journals                           "Denníky"
   :left-side-bar/create                             "Vytvoriť"
   :left-side-bar/new-page                           "Nová stránka"
   :left-side-bar/new-whiteboard                     "Nová tabuľa"
   :left-side-bar/nav-favorites                      "Obľúbené"
   :left-side-bar/nav-recent-pages                   "Posledné"
   :page/presentation-mode                           "Prezentácia"
   :page/delete-confirmation                         "Naozaj chcete odstrániť túto stránku a jej súbor?"
   :page/open-in-finder                              "Otvoriť v adresári"
   :page/open-with-default-app                       "Otvoriť pomocou predvolenej aplikácie"
   :page/make-public                                 "Označiť stránku ako verejnú"
   :page/version-history                             "Zobraziť históriu stránky"
   :page/open-backup-directory                       "Otvoriť adresár so zálohami stránky"
   :page/make-private                                "Označiť stránku ako súkromnú"
   :page/delete                                      "Odstrániť stránku"
   :page/add-to-favorites                            "Pridať medzi obľúbené"
   :page/unfavorite                                  "Odobrať z obľubených"
   :page/show-journals                               "Zobraziť denníky"
   :page/show-whiteboards                            "Zobraziť tabule"
   :block/name                                       "Názav stránky"
   :page/earlier                                     "Skôr"
   :page/copy-page-url                               "Kopírovať URL stránky"
   :file/name                                        "Názov súboru"
   :file/last-modified-at                            "Naposledy upravený"
   :file/no-data                                     "Žiadne dáta"
   :file/format-not-supported                        "Formát .{1} nie je podporovaný."
   :file/validate-existing-file-error                "Stránka už existuje s iným súborom: {1}, aktuálny súbor: {2}. Ponechajte si len jeden z nich a znova preindexujte svoj graf."
   :file-rn/re-index                                 "Po premenovaní súborov a po synchronizácii na iných zariadeniach je dôrazne odporúčané spustiť preindexovanie."
   :file-rn/need-action                              "Akcie premenovania súboru by sa mali zhodovať s novým formátom. Požaduje sa preindexovanie na všetkých zariadeniach, keď sa všetky premenované súbory zosynchronizujú."
   :file-rn/or-select-actions                        " alebo premenujte súbory nižšie po jednom a potom "
   :file-rn/or-select-actions-2                      ". Po zatvorení tohto panela nebudú tieto akcie dostupné."
   :file-rn/legend                                   "🟢 Voliteľné akcie premenovania; 🟡 Vyžaduje sa akcia premenovania, aby sa zabránilo zmene názvu; 🔴 Nekompatibilná zmena."
   :file-rn/close-panel                              "Zatvoriť panel"
   :file-rn/all-action                               "Použiť všetky akcie!"
   :file-rn/select-format                            "(Režimu vývojára, Nebezpečné!) Vybrať formát súboru"
   :file-rn/rename                                   "premenovať súbor \"{1}\" na \"{2}\""
   :file-rn/apply-rename                             "Použiť operáciu premenovania súboru"
   :file-rn/suggest-rename                           "Vyžaduje sa akcia:"
   :file-rn/otherwise-breaking                       "Alebo sa názov stane"
   :file-rn/no-action                                "Výborne! Nevyžaduje sa žiadna ďalšia akcia."
   :file-rn/confirm-proceed                          "Aktualizujte formát!"
   :file-rn/select-confirm-proceed                   "Dev: formát zápisu"
   :file-rn/unreachable-title                        "Pozor! Názov stránky sa zmení na {1} s použitím aktuálneho formátu názvu súboru, ak nastavenie `title::` nie je nastavená manuálne"
   :file-rn/optional-rename                          "Návrh: "
   :file-rn/format-deprecated                        "Momentálne používate zastaraný formát. Dôrazne sa odporúča aktualizovať na najnovší formát. Pred operáciou si zálohujte svoje údaje a zatvorte Logseq klientov na iných zariadeniach."
   :file-rn/filename-desc-1                          "Toto nastavenie konfiguruje spôsob uloženia stránky do súboru. Logseq ukladá stránku do súboru s rovnakým názvom."
   :file-rn/filename-desc-2                          "Niektoré znaky ako \"/\" alebo \"?\" nie je možné v názve súboru použiť."
   :file-rn/filename-desc-3                          "Logseq nahrádza neplatné znaky ich ekvivalentom zakódovaným v URL tak, aby boli platné (napr. \"?\" sa zmení na \"%3F\")."
   :file-rn/filename-desc-4                          "Oddeľovač názvov \"/\" je z estetických dôvodov tiež nahradený znakom \"___\" (trojité podčiarknutie)."
   :file-rn/instruct-1                               "Zmena formátu súboru je dvojkrokový proces:"
   :file-rn/instruct-2                               "1. Kliknite na "
   :file-rn/instruct-3                               "2. Ak chcete premenovať súbory na nový formát, postupujte podľa pokynov nižšie:"
   :page/created-at                                  "Vytvorené"
   :page/updated-at                                  "Aktualizované"
   :page/backlinks                                   "Spätné odkazy"
   :linked-references/filter-search                  "Hľadať v prepojených stránkach"
   :editor/block-search                              "Vyhľadať blok"
   :text/image                                       "Obrázok"
   :asset/show-in-folder                             "Zobraziť obrázok v adresári"
   :asset/open-in-browser                            "Zobraziť obrázok v prehliadači"
   :asset/delete                                     "Odstrániť obrázok"
   :asset/copy                                       "Kopírovať obrázok"
   :asset/maximize                                   "Maximalizovať obrázok"
   :asset/confirm-delete                             "Naozaj chcete odstrániť tento {1}?"
   :asset/physical-delete                            "Odstrániť aj súbor (už nebude možné ho obnoviť)"
   :color/gray                                       "Šedá"
   :color/red                                        "Červená"
   :color/yellow                                     "Žltá"
   :color/green                                      "Zelená"
   :color/blue                                       "Modrá"
   :color/purple                                     "Fialová"
   :color/pink                                       "Ružová"
   :editor/copy                                     "Kopírovať"
   :editor/cut                                      "Vystrihnúť"
   :content/copy-block-ref                           "Kopírovať referenciu bloku"
   :content/copy-block-emebed                        "Kopírovať blok ako vložený"
   :content/open-in-sidebar                          "Otvoriť na bočnom paneli"
   :content/click-to-edit                            "Kliknutím upravíte"
   :settings-page/git-confirm                        "Po aktualizácii Git nastavení musíte reštartovať aplikáciu."
   :settings-page/git-switcher-label                 "Povoliť automatický zápis do Git"
   :settings-page/git-commit-delay                   "Automatický zápis do Git po sekundách"
   :settings-page/edit-config-edn                    "Upraviť config.edn"
   :settings-page/edit-global-config-edn             "Upraviť globálny config.edn"
   :settings-page/edit-custom-css                    "Upraviť custom.css"
   :settings-page/edit-export-css                    "Upraviť export.css"
   :settings-page/edit-setting                       "Upraviť"
   :settings-page/custom-configuration               "Vlastná konfigurácia"
   :settings-page/custom-global-configuration        "Vlastná globálna konfigurácia"
   :settings-page/custom-theme                       "Vlastný motív"
   :settings-page/export-theme                       "Exportovať motív"
   :settings-page/show-brackets                      "Zobraziť zátvorky"
   :settings-page/spell-checker                      "Kontrola pravopisu"
   :settings-page/auto-updater                       "Automatická aktualizácia"
   :settings-page/disable-sentry                     "Odoslať údaje o používaní a diagnostiku do Logseq"
   :settings-page/disable-sentry-desc                "Logseq nebude nikdy zhromažďovať vašu lokálnu databázu grafov ani predávať vaše údaje."
   :settings-page/preferred-outdenting               "Logické odsadenie"
   :settings-page/show-full-blocks                   "Zobraziť všetky riadky referencie bloku"
   :settings-page/custom-date-format                 "Preferovaný formát dátumu"
   :settings-page/custom-date-format-warning         "Vyžaduje sa preindexovanie! Existujúce odkazy na denníky by boli poškodené!"
   :settings-page/preferred-file-format              "Preferovaný formát súboru"
   :settings-page/preferred-workflow                 "Preferovaný pracovný postup"
   :settings-page/preferred-pasting-file             "Preferovaný súbor na prilepenie"
   :settings-page/enable-shortcut-tooltip            "Povoliť nápovedy ku klávesovým skratkám"
   :settings-page/enable-timetracking                "Meranie času"
   :settings-page/enable-tooltip                     "Povoliť okno s nápovedou"
   :settings-page/enable-journals                    "Denníky"
   :settings-page/enable-all-pages-public            "Všetky stránky označiť ako verejné"
   :settings-page/customize-shortcuts                "Klávesové skratky"
   :settings-page/shortcut-settings                  "Prispôsobiť skratky"
   :settings-page/home-default-page                  "Nastaviť predvolenú domovskú stránku"
   :settings-page/enable-block-time                  "Povoliť časové pečiatky bloku"
   :settings-page/clear-cache                        "Vymazať vyrovnávaciu pamäť"
   :settings-page/clear                              "Vymazať"
   :settings-page/clear-cache-warning                "Vymazaním vyrovnávacej pamäte sa vymažú otvorené grafy. Prídete o neuložené zmeny."
   :settings-page/developer-mode                     "Režim pre vývojárov"
   :settings-page/developer-mode-desc                "Režim pre vývojárov pomáha prispievateľom a vývojárom doplnkov efektívnejšie testovať integráciu s Logseq."
   :settings-page/current-version                    "Aktuálna verzia"
   :settings-page/tab-general                        "Všeobecné"
   :settings-page/tab-version-control                "Verzovanie"
   :settings-page/tab-advanced                       "Pokročilé"
   :settings-page/tab-features                       "Funkcie"
   :settings-page/plugin-system                      "Doplnky"
   :settings-page/enable-flashcards                  "Kartičky"
   :settings-page/network-proxy                      "Sieťová proxy"
   :settings-page/filename-format                    "Formát názvu súboru"
   :settings-page/alpha-features                     "Alfa funkcie"
   :settings-page/beta-features                      "Beta funkcie"
   :settings-page/login-prompt                       "Ak chcete získať prístup k novým funkciám skôr ako ktokoľvek iný, musíte byť sponzorom nadácie Open Collective alebo podporovateľom Logseq, následne sa musíte prihlásiť."
   :settings-page/sync                               "Synchronizovať"
   :settings-page/enable-whiteboards                 "Tabule"
   :yes                                              "Áno"
   :submit                                           "Odoslať"
   :cancel                                           "Zrušiť"
   :close                                            "Zavrieť"
   :delete                                           "Odstrániť"
   :save                                             "Uložiť"
   :type                                             "Typ"
   :re-index                                         "Preindexovať"
   :re-index-detail                                  "Obnovte graf"
   :re-index-multiple-windows-warning                "Pred preindexovaním grafu musíte zavrieť ostatné okná."
   :re-index-discard-unsaved-changes-warning         "Preindexovanie vymaže aktuálny graf a potom znova spracuje všetky súbory tak, ako sú aktuálne uložené na disku. Prídete o neuložené zmeny a môže to chvíľu trvať. Chcete pokračovať?"
   :open-new-window                                  "Nové okno"
   :sync-from-local-files                            "Obnoviť"
   :sync-from-local-files-detail                     "Importovať zmeny z lokálnych súborov"
   :sync-from-local-changes-detected                 "Obnovenie detekuje a spracuje upravené súbory na vašom disku, ktoré sa líšia od aktuálneho obsahu Logseq stránky. Chcete pokračovať?"

   :search/publishing                                "Vyhľadávanie"
   :search                                           "Vyhľadať alebo vytvoriť stránku"
   :whiteboard/link-whiteboard-or-block              "Prepojiť tabuľu/stránku/blok"
   :page-search                                      "Hľadať na aktuálnej stránke"
   :graph-search                                     "Hľadať v grafe"
   :new-page                                         "Nová stránka"
   :new-whiteboard                                   "Nová tabuľa"
   :new-graph                                        "Pridať nový graf"
   :graph                                            "Graf"
   :graph/persist                                    "Logseq synchronizuje interný stav, počkajte prosím niekoľko sekúnd."
   :graph/persist-error                              "Synchronizácia interného stavu zlyhala."
   :graph/save                                       "Ukladá sa..."
   :graph/save-success                               "Úspešne uložené"
   :graph/save-error                                 "Uloženie zlyhalo"
   :graph/all-graphs                                 "Všetky grafy"
   :graph/local-graphs                               "Lokálne grafy"
   :graph/remote-graphs                              "Vzdialené grafy"
   :export-graph                                     "Exportovať graf"
   :export-page                                      "Exportovať stránku"
   :export-markdown                                  "Exportovať ako štandardný Markdown (žiadne vlastnosti bloku)"
   :export-opml                                      "Exportovať ako OPML"
   :export-public-pages                              "Exportovať verejné stránky"
   :export-json                                      "Exportovať ako JSON"
   :export-roam-json                                 "Exportovať ako Roam JSON"
   :export-edn                                       "Exportovať ako EDN"
   :all-graphs                                       "Všetky grafy"
   :all-pages                                        "Všetky stránky"
   :all-whiteboards                                  "Všetky tabule"
   :all-files                                        "Všetky súbory"
   :remove-orphaned-pages                            "Odstrániť osamotené stránky"
   :all-journals                                     "Všetky denníky"
   :settings                                         "Nastavenia"
   :settings-of-plugins                              "Doplnky"
   :plugins                                          "Doplnky"
   :themes                                           "Motívy"
   :relaunch-confirm-to-work                         "Aby aplikácia fungovala, mala byť reštartovaná. Chcete ju reštartovať teraz?"
   :import                                           "Importovať"
   :importing                                        "Importuje sa"
   :join-community                                   "Pridať sa ku komunite"
   :discourse-title                                  "Naše fórum!"
   :help-shortcut-title                              "Kliknutím zobrazíte skratky a ďalšie tipy"
   :loading                                          "Načítava sa"
   :parsing-files                                    "Parsovanie súborov"
   :loading-files                                    "Načítavajú sa súbory"
   :login                                            "Prihlásiť sa"
   :logout                                           "Odhlásiť sa"
   :download                                         "Stiahnuť"
   :language                                         "Jazyk"
   :remove-background                                "Odstrániť pozadie"
   :remove-heading                                   "Odstrániť nadpis"
   :heading                                          "Nadpis {1}"
   :auto-heading                                     "Automatický nadpis"
   :open-a-directory                                 "Otvoriť lokálny adresár"

   :help/shortcut-page-title                         "Klávesové skratky"

   :plugin/installed                                 "Nainštalované"
   :plugin/not-installed                             "Nenainštalované"
   :plugin/installing                                "Inštaluje sa"
   :plugin/install                                   "Inštalovať"
   :plugin/reload                                    "Znova načítať"
   :plugin/update                                    "Aktualizovať"
   :plugin/check-update                              "Skontrolovať aktualizáciu"
   :plugin/check-all-updates                         "Skontrolovať všetky aktualizácie"
   :plugin/refresh-lists                             "Obnoviť zoznam"
   :plugin/enabled                                   "Povolené"
   :plugin/disabled                                  "Zakázané"
   :plugin/update-available                          "S dostupnou aktualizáciou"
   :plugin/updating                                  "Aktualizuje sa"
   :plugin/uninstall                                 "Odinštalovať"
   :plugin/marketplace                               "Obchod"
   :plugin/downloads                                 "Počet stiahnutí"
   :plugin/stars                                     "Počet hviezd"
   :plugin/title                                     "Názov"
   :plugin/all                                       "Všetky"
   :plugin/unpacked                                  "Rozbalené"
   :plugin/delete-alert                              "Naozaj chcete odinštalovať doplnok [{1}]?"
   :plugin/open-settings                             "Otvoriť nastavenia"
   :plugin/open-package                              "Otvoriť balík"
   :plugin/load-unpacked                             "Načítať rozbalený doplnok"
   :plugin/restart                                   "Reštartovať aplikáciu"
   :plugin/unpacked-tips                             "Vyberte adresár doplnku"
   :plugin/contribute                                "✨ Vytvorte a odošlite nový doplnok"
   :plugin/up-to-date                                "Je nainštalovaná najnovšia verzia"
   :plugin/custom-js-alert                           "Našiel sa súbor custom.js, je povolené jeho spustenie? (Ak nerozumiete obsahu tohto súboru, odporúčame nepovoliť jeho spustenie, ktoré má určité bezpečnostné riziká.)"
   :plugin.install-from-file/menu-title              "Inštalovať z plugins.edn"
   :plugin.install-from-file/title                   "Inštalovať doplnky z plugins.edn"
   :plugin.install-from-file/notice                  "Nasledujúce doplnky nahradia vaše doplnky:"
   :plugin.install-from-file/success                 "Všetky doplnky nainštalované!"

   :pdf/copy-ref                                     "Kopírovať referenciu"
   :pdf/copy-text                                    "Kopírovať text"
   :pdf/linked-ref                                   "Prepojené referencie"
   :pdf/toggle-dashed                                "Prerušovaný štýl pre zvýraznenie oblasti"
   :pdf/hl-block-colored                             "Farebný štítok pre zvýraznený blok"
   :pdf/doc-metadata                                 "Metadáta dokumentu"

   :updater/new-version-install                      "Bola stiahnutá nová verzia."
   :updater/quit-and-install                         "Reštartovať a nainštalovať"

   :paginates/pages                                  "Celkovo {1} strán"
   :paginates/prev                                   "Predchádzajúca"
   :paginates/next                                   "Ďalšia"

   :tips/all-done                                    "Hotovo"

   :command-palette/prompt                           "Zadať príkaz"
   :select/default-prompt                            "Vybrať jeden"
   :select.graph/prompt                              "Vybrať graf"
   :select.graph/empty-placeholder-description       "Žiadne zodpovedajúce grafy. Chcete pridať ďalší?"
   :select.graph/add-graph                           "Áno, pridať ďalší graf"

   :file-sync/other-user-graph                       "Aktuálny lokálny graf je prepojený so vzdialeným grafom iného používateľa. Nie je možné spustiť synchronizáciu.."
   :file-sync/graph-deleted                          "Aktuálny vzdialený graf bol odstránený."

   :notification/clear-all                           "Zmazať všetko"

   :shortcut.category/formatting                             "Formátovanie"
   :shortcut.category/basics                                 "Základy"
   :shortcut.category/navigating                             "Navigácia"
   :shortcut.category/block-editing                          "Úprava bloku (všeobecné)"
   :shortcut.category/block-command-editing                  "Príkazy na úpravu bloku"
   :shortcut.category/block-selection                        "Výber bloku (výber ukončíte stlačením klávesy Esc)"
   :shortcut.category/toggle                                 "Prepínače"
   :shortcut.category/others                                 "Ostatné"

   :command.date-picker/complete                             "Výber dátumu: podvrďte vybraný deň"
   :command.date-picker/next-day                             "Výber dátumu: vyberte nasledujúci deň"
   :command.date-picker/next-week                            "Výber dátumu: vyberte nasledujúci týždeň"
   :command.date-picker/prev-day                             "Výber dátumu: vyberte predchádzajúci deň"
   :command.date-picker/prev-week                            "Výber dátumu: vyberte predchádzajúci týždeň"
   :command.pdf/previous-page                                "PDF: Predchádzajúca strana aktuálneho PDF dokumentu"
   :command.pdf/next-page                                    "PDF: Nasledujúca strana aktuálneho PDF dokumentu"
   :command.pdf/close                                        "PDF: Zatvoriť aktuálny PDF dokument"
   :command.pdf/find                                         "PDF: Vyhľadať text v aktuálnom pdf dokumente"
   :command.auto-complete/complete                           "Automatické dokončovanie: Potvrdiť vybranú položku"
   :command.auto-complete/prev                               "Automatické dokončovanie: Vybrať predchádzajúcu položku"
   :command.auto-complete/next                               "Automatické dokončovanie: Vybrať ďalšiu položku"
   :command.auto-complete/shift-complete                     "Automatické dokončovanie: Otvoriť vybranú položku na bočnom paneli"
   :command.auto-complete/open-link                          "Automatické dokončovanie: Otvoriť vybranú položku v prehliadači"
   :command.cards/toggle-answers                             "Karty: Zobraziť/Skryť odpovede"
   :command.cards/next-card                                  "Karty: Ďalšia karta"
   :command.cards/forgotten                                  "Karty: Zabudnuté"
   :command.cards/remembered                                 "Karty: Zapamätané"
   :command.cards/recall                                     "Karty: take a while to recall"
   :command.editor/escape-editing                            "Zrušiť editovanie"
   :command.editor/backspace                                 "Zmazať dozadu"
   :command.editor/delete                                    "Zmazať dopredu"
   :command.editor/new-block                                 "Vytvoriť nový blok"
   :command.editor/new-line                                  "Nový riadok v aktuálnom bloku"
   :command.editor/new-whiteboard                            "Nová tabuľa"
   :command.editor/follow-link                               "Prejsť na odkaz pod kurzorom"
   :command.editor/open-link-in-sidebar                      "Otvoriť odkaz v bočnom paneli"
   :command.editor/bold                                      "Tučné"
   :command.editor/italics                                   "Kurzíva"
   :command.editor/highlight                                 "Zvýrazniť"
   :command.editor/strike-through                            "Prečiarknuté"
   :command.editor/clear-block                               "Odstrániť celý obsah bloku"
   :command.editor/kill-line-before                          "Odstrániť riadok pred pozíciou kurzora"
   :command.editor/copy-embed                                "Kopírovať vložený blok ukazujúci na aktuálny blok"
   :command.editor/kill-line-after                           "Odstrániť riadok za pozíciou kurzora"
   :command.editor/beginning-of-block                        "Presunúť kurzor na začiatok bloku"
   :command.editor/end-of-block                              "Presunúť kurzor na koniec bloku"
   :command.editor/forward-word                              "Posunúť kurzor o slovo dopredu"
   :command.editor/backward-word                             "Presunúť kurzor o slovo dozadu"
   :command.editor/forward-kill-word                         "Vymazať slovo dopredu"
   :command.editor/backward-kill-word                        "Vymazať slovo dozadu"
   :command.editor/replace-block-reference-at-point          "Nahradiť referenciu bloku jeho obsahom v bode"
   :command.editor/paste-text-in-one-block-at-point          "Prilepiť text do jedného bloku v bode"
   :command.editor/insert-youtube-timestamp                  "Vložiť YouTube časovú značku"
   :command.editor/cycle-todo                                "Zmeniť stav TODO aktuálnej položky"
   :command.editor/up                                        "Posunúť kurzor nahor/Vybrať nahor"
   :command.editor/down                                      "Posunúť kurzor nadol/Vybrať nadol"
   :command.editor/left                                      "Posunúť kurzor doľava/Otvoriť vybraný blok na začiatku"
   :command.editor/right                                     "Posunúť kurzor doprava/Otvoriť vybraný blok na konci"
   :command.editor/select-up                                 "Vybrať obsah vyššie"
   :command.editor/select-down                               "Vybrať obsah nižšie"
   :command.editor/move-block-up                             "Posunúť blok nahor"
   :command.editor/move-block-down                           "Posunúť blok nadol"
   :command.editor/open-edit                                 "Upraviť vybraný blok"
   :command.editor/select-block-up                           "Vybrať blok vyššie"
   :command.editor/select-block-down                         "Vybrať blok nižšie"
   :command.editor/delete-selection                          "Odstrániť vybrané bloky"
   :command.editor/expand-block-children                     "Rozbaliť"
   :command.editor/collapse-block-children                   "Zbaliť"
   :command.editor/indent                                    "Odsadiť blok"
   :command.editor/outdent                                   "Zrusiť odsadenie bloku"
   :command.editor/copy                                      "Kopírovať (skopíruje buď výber alebo referenciu na blok)"
   :command.editor/copy-text                                 "Kopírovať výber ako text"
   :command.editor/cut                                       "Vystrihnúť"
   :command.editor/undo                                      "Zrusiť zmenu"
   :command.editor/redo                                      "Znova"
   :command.editor/insert-link                               "HTML odkaz"
   :command.editor/select-all-blocks                         "Vybrať všetky bloky"
   :command.editor/select-parent                             "Vybrať rodičovský blok"
   :command.editor/zoom-in                                   "Priblížiť upravovaný blok/Inak vpred"
   :command.editor/zoom-out                                  "Oddialiť upravaný blok/Inak dozadu"
   :command.ui/toggle-brackets                               "Prepnúť, či sa majú zobraziť hranaté zátvorky"
   :command.go/search-in-page                                "Hľadať bloky na aktuálnej stránke"
   :command.go/electron-find-in-page                         "Nájsť text na stránke"
   :command.go/electron-jump-to-the-next                     "Preskočiť na ďalšiu zhodu s vyhľadávaním v Paneli hľadania"
   :command.go/electron-jump-to-the-previous                 "Preskočiť na predchádzajúcu zhodu s vyhľadávaním v Paneli hľadania"
   :command.go/search                                        "Hľadať stránky a bloky"
   :command.go/journals                                      "Choď do denníkov"
   :command.go/backward                                      "Späť"
   :command.go/forward                                       "Vpred"
   :command.search/re-index                                  "Obnoviť index vyhľadávania"
   :command.sidebar/open-today-page                          "Otvoriť dnešnú stránku v pravom bočnom paneli"
   :command.sidebar/close-top                                "Zavri hornú položku na pravom bočnom paneli"
   :command.sidebar/clear                                    "Vymazať všetko na pravom bočnom paneli"
   :command.misc/copy                                        "Kopírovať"
   :command.command-palette/toggle                           "Zobraziť/Skryť zoznam príkazov"
   :command.graph/export-as-html                             "Exportovať verejné stránky grafu ako HTML"
   :command.graph/open                                       "Vybrať graf na otvorenie"
   :command.graph/remove                                     "Odstrániť graf"
   :command.graph/add                                        "Pridať graf"
   :command.graph/save                                       "Uložiť aktuálny graf na disk"
   :command.graph/re-index                                   "Preindexovať aktuálny graf"
   :command.command/run                                      "Spustiť príkaz GIT"
   :command.go/home                                          "Prejsť na hlavnú stránku"
   :command.go/all-graphs                                    "Prejsť na všetky grafy"
   :command.go/whiteboards                                   "Prejsť na tabule"
   :command.go/all-pages                                     "Prejsť na všetky stránky"
   :command.go/graph-view                                    "Prejsť na zobrazenie grafu"
   :command.go/keyboard-shortcuts                            "Prejsť na klávesové skratky"
   :command.go/tomorrow                                      "Prejsť na zajtrajší denník"
   :command.go/next-journal                                  "Prejsť na ďalší denník"
   :command.go/prev-journal                                  "Prejsť na predchádzajúci denník"
   :command.go/flashcards                                    "Zobraziť/Skryť kartičky"
   :command.ui/toggle-document-mode                          "Zobraziť/Skryť režim dokumentu"
   :command.ui/toggle-settings                               "Prepnúť nastavenia"
   :command.ui/toggle-right-sidebar                          "Zobraziť/Skryť pravý bočný panel"
   :command.ui/toggle-left-sidebar                           "Zobraziť/Skryť ľavý bočný panel"
   :command.ui/toggle-help                                   "Zobraziť/Skryť pomocníka"
   :command.ui/toggle-theme                                  "Prepínať medzi tmavým/svetlým motívom"
   :command.ui/toggle-contents                               "Zobraziť/Skryť obsah na bočnom paneli"
   :command.command/toggle-favorite                          "Pridať/Odstrániť z obľúbených"
   :command.editor/open-file-in-default-app                  "Otvoriť súbor v predvolenej aplikácii"
   :command.editor/open-file-in-directory                    "Otvoriť súbor v nadradenom adresári"
   :command.editor/copy-current-file                         "Skopírovať aktuálny súbor"
   :command.ui/toggle-wide-mode                              "Prepnúť širokouhlý režim"
   :command.ui/select-theme-color                            "Vyberte dostupné farby motívu"
   :command.ui/goto-plugins                                  "Prejsť na zoznam doplnkov"
   :command.ui/install-plugins-from-file                     "Inštalovať doplnky z plugins.edn"
   :command.editor/toggle-open-blocks                        "Prepnúť otvorené bloky (zbaliť alebo rozbaliť všetky bloky)"
   :command.ui/toggle-cards                                  "Zobraziť/Skryť karty"
   :command.git/commit                                       "Spusiť príkaz git commit so správou"})