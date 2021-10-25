```mermaid
graph LR
    
    subgraph LayercommonTools
        s0 -- "select0" --> s0
        
    end
    subgraph LayertimeBar
        s1 -- "select2" --> s6
        s1 -- "select4" --> s7
        s1 -- "select6" --> s8
        s1 -- "select8" --> s9
        s1 -- "select10" --> s10
        s6 -- "tapG12" --> s6
        s6 -- "tapF16" --> s6
        s6 -- "select20" --> s7
        s6 -- "select22" --> s8
        s6 -- "select24" --> s9
        s6 -- "tapA26" --> s6
        s6 -- "tapD30" --> s6
        s6 -- "tapE34" --> s6
        s6 -- "tapB38" --> s6
        s6 -- "tapC42" --> s6
        s6 -- "select46" --> s10
        s7 -- "select48" --> s6
        s7 -- "select50" --> s8
        s7 -- "select52" --> s9
        s7 -- "pat54" --> s12
        s7 -- "select56" --> s10
        s7 -- "select204" --> s6
        s7 -- "select206" --> s8
        s7 -- "select208" --> s9
        s7 -- "pat210" --> s12
        s7 -- "select212" --> s10
        s8 -- "tapD58" --> s8
        s8 -- "tapF62" --> s8
        s8 -- "select66" --> s6
        s8 -- "tapA68" --> s8
        s8 -- "tapC72" --> s8
        s8 -- "select76" --> s7
        s8 -- "tapB78" --> s8
        s8 -- "tapE82" --> s8
        s8 -- "select86" --> s9
        s8 -- "tapG88" --> s8
        s8 -- "select92" --> s10
        s9 -- "select94" --> s6
        s9 -- "tapF96" --> s9
        s9 -- "select100" --> s7
        s9 -- "select102" --> s8
        s9 -- "tapC104" --> s9
        s9 -- "tapG108" --> s9
        s9 -- "tapA112" --> s9
        s9 -- "tapD116" --> s9
        s9 -- "tapE120" --> s9
        s9 -- "tapB124" --> s9
        s9 -- "select128" --> s10
        s10 -- "select130" --> s6
        s10 -- "tapD132" --> s10
        s10 -- "select136" --> s7
        s10 -- "tapC138" --> s10
        s10 -- "select142" --> s8
        s10 -- "tapE144" --> s10
        s10 -- "select148" --> s9
        s10 -- "tapA150" --> s10
        s10 -- "tapF154" --> s10
        s10 -- "tapB158" --> s10
        s10 -- "tapG162" --> s10
        s12 -- "tapF166" --> s7
        s12 -- "select170" --> s6
        s12 -- "tapB172" --> s7
        s12 -- "after2176" --> s13
        s12 -- "tapD178" --> s7
        s12 -- "select182" --> s8
        s12 -- "tapC184" --> s7
        s12 -- "tapA188" --> s7
        s12 -- "select192" --> s9
        s12 -- "tapE194" --> s7
        s12 -- "pat198" --> s12
        s12 -- "tapG200" --> s7
        s12 -- "tapF252" --> s7
        s12 -- "select256" --> s6
        s12 -- "tapB258" --> s7
        s12 -- "after2262" --> s13
        s12 -- "tapD264" --> s7
        s12 -- "select268" --> s8
        s12 -- "tapC270" --> s7
        s12 -- "tapA274" --> s7
        s12 -- "select278" --> s9
        s12 -- "tapE280" --> s7
        s12 -- "pat284" --> s12
        s12 -- "tapG286" --> s7
        s13 -- "tapA214" --> s7
        s13 -- "tapD218" --> s7
        s13 -- "after2222" --> s14
        s13 -- "tapB224" --> s7
        s13 -- "tapE228" --> s7
        s13 -- "select232" --> s8
        s13 -- "tapF234" --> s7
        s13 -- "select238" --> s9
        s13 -- "tapG240" --> s7
        s13 -- "pat244" --> s12
        s13 -- "tapC246" --> s7
        s13 -- "select250" --> s10
        s13 -- "tapA328" --> s7
        s13 -- "tapD332" --> s7
        s13 -- "after2336" --> s14
        s13 -- "tapB338" --> s7
        s13 -- "tapE342" --> s7
        s13 -- "select346" --> s8
        s13 -- "tapF348" --> s7
        s13 -- "select352" --> s9
        s13 -- "tapG354" --> s7
        s13 -- "pat358" --> s12
        s13 -- "tapC360" --> s7
        s13 -- "select364" --> s10
        s14 -- "tapC290" --> s7
        s14 -- "after4294" --> s15
        s14 -- "select296" --> s6
        s14 -- "tapG298" --> s7
        s14 -- "tapD302" --> s7
        s14 -- "select306" --> s9
        s14 -- "tapA308" --> s7
        s14 -- "tapF312" --> s7
        s14 -- "pat316" --> s12
        s14 -- "tapE318" --> s7
        s14 -- "select322" --> s10
        s14 -- "tapB324" --> s7
        s14 -- "tapC402" --> s7
        s14 -- "after4406" --> s15
        s14 -- "select408" --> s6
        s14 -- "tapG410" --> s7
        s14 -- "tapD414" --> s7
        s14 -- "select418" --> s9
        s14 -- "tapA420" --> s7
        s14 -- "tapF424" --> s7
        s14 -- "pat428" --> s12
        s14 -- "tapE430" --> s7
        s14 -- "select434" --> s10
        s14 -- "tapB436" --> s7
        s15 -- "select366" --> s6
        s15 -- "select368" --> s8
        s15 -- "tapB370" --> s7
        s15 -- "tapA374" --> s7
        s15 -- "pat378" --> s12
        s15 -- "tapD380" --> s7
        s15 -- "tapF384" --> s7
        s15 -- "tapC388" --> s7
        s15 -- "tapE392" --> s7
        s15 -- "tapG396" --> s7
        s15 -- "select400" --> s10
        s15 -- "select440" --> s6
        s15 -- "select442" --> s8
        s15 -- "tapB444" --> s7
        s15 -- "tapA448" --> s7
        s15 -- "pat452" --> s12
        s15 -- "tapD454" --> s7
        s15 -- "tapF458" --> s7
        s15 -- "tapC462" --> s7
        s15 -- "tapE466" --> s7
        s15 -- "tapG470" --> s7
        s15 -- "select474" --> s10
        
    end
    subgraph Layercanvas
        s2 -- "tapG12" --> s2
        s2 -- "tapF16" --> s2
        s2 -- "tapA26" --> s2
        s2 -- "tapD30" --> s2
        s2 -- "tapE34" --> s2
        s2 -- "tapB38" --> s2
        s2 -- "tapC42" --> s2
        s2 -- "tapD58" --> s2
        s2 -- "tapF62" --> s2
        s2 -- "tapA68" --> s2
        s2 -- "tapC72" --> s2
        s2 -- "tapB78" --> s2
        s2 -- "tapE82" --> s2
        s2 -- "tapG88" --> s2
        s2 -- "tapF96" --> s2
        s2 -- "tapC104" --> s2
        s2 -- "tapG108" --> s2
        s2 -- "tapA112" --> s2
        s2 -- "tapD116" --> s2
        s2 -- "tapE120" --> s2
        s2 -- "tapB124" --> s2
        s2 -- "tapD132" --> s2
        s2 -- "tapC138" --> s2
        s2 -- "tapE144" --> s2
        s2 -- "tapA150" --> s2
        s2 -- "tapF154" --> s2
        s2 -- "tapB158" --> s2
        s2 -- "tapG162" --> s2
        s2 -- "tapF166" --> s2
        s2 -- "tapB172" --> s2
        s2 -- "tapD178" --> s2
        s2 -- "tapC184" --> s2
        s2 -- "tapA188" --> s2
        s2 -- "tapE194" --> s2
        s2 -- "tapG200" --> s2
        s2 -- "tapA214" --> s2
        s2 -- "tapD218" --> s2
        s2 -- "tapB224" --> s2
        s2 -- "tapE228" --> s2
        s2 -- "tapF234" --> s2
        s2 -- "tapG240" --> s2
        s2 -- "tapC246" --> s2
        s2 -- "tapF252" --> s2
        s2 -- "tapB258" --> s2
        s2 -- "tapD264" --> s2
        s2 -- "tapC270" --> s2
        s2 -- "tapA274" --> s2
        s2 -- "tapE280" --> s2
        s2 -- "tapG286" --> s2
        s2 -- "tapC290" --> s2
        s2 -- "tapG298" --> s2
        s2 -- "tapD302" --> s2
        s2 -- "tapA308" --> s2
        s2 -- "tapF312" --> s2
        s2 -- "tapE318" --> s2
        s2 -- "tapB324" --> s2
        s2 -- "tapA328" --> s2
        s2 -- "tapD332" --> s2
        s2 -- "tapB338" --> s2
        s2 -- "tapE342" --> s2
        s2 -- "tapF348" --> s2
        s2 -- "tapG354" --> s2
        s2 -- "tapC360" --> s2
        s2 -- "tapB370" --> s2
        s2 -- "tapA374" --> s2
        s2 -- "tapD380" --> s2
        s2 -- "tapF384" --> s2
        s2 -- "tapC388" --> s2
        s2 -- "tapE392" --> s2
        s2 -- "tapG396" --> s2
        s2 -- "tapC402" --> s2
        s2 -- "tapG410" --> s2
        s2 -- "tapD414" --> s2
        s2 -- "tapA420" --> s2
        s2 -- "tapF424" --> s2
        s2 -- "tapE430" --> s2
        s2 -- "tapB436" --> s2
        s2 -- "tapB444" --> s2
        s2 -- "tapA448" --> s2
        s2 -- "tapD454" --> s2
        s2 -- "tapF458" --> s2
        s2 -- "tapC462" --> s2
        s2 -- "tapE466" --> s2
        s2 -- "tapG470" --> s2
        
    end
    subgraph Layercursor
        s3 -- "tapG12" --> s11
        s3 -- "tapF16" --> s11
        s3 -- "tapA26" --> s11
        s3 -- "tapD30" --> s11
        s3 -- "tapE34" --> s11
        s3 -- "tapB38" --> s11
        s3 -- "tapC42" --> s11
        s3 -- "tapD58" --> s11
        s3 -- "tapF62" --> s11
        s3 -- "tapA68" --> s11
        s3 -- "tapC72" --> s11
        s3 -- "tapB78" --> s11
        s3 -- "tapE82" --> s11
        s3 -- "tapG88" --> s11
        s3 -- "tapF96" --> s11
        s3 -- "tapC104" --> s11
        s3 -- "tapG108" --> s11
        s3 -- "tapA112" --> s11
        s3 -- "tapD116" --> s11
        s3 -- "tapE120" --> s11
        s3 -- "tapB124" --> s11
        s3 -- "tapD132" --> s11
        s3 -- "tapC138" --> s11
        s3 -- "tapE144" --> s11
        s3 -- "tapA150" --> s11
        s3 -- "tapF154" --> s11
        s3 -- "tapB158" --> s11
        s3 -- "tapG162" --> s11
        s3 -- "tapF166" --> s11
        s3 -- "tapB172" --> s11
        s3 -- "tapD178" --> s11
        s3 -- "tapC184" --> s11
        s3 -- "tapA188" --> s11
        s3 -- "tapE194" --> s11
        s3 -- "tapG200" --> s11
        s3 -- "tapA214" --> s11
        s3 -- "tapD218" --> s11
        s3 -- "tapB224" --> s11
        s3 -- "tapE228" --> s11
        s3 -- "tapF234" --> s11
        s3 -- "tapG240" --> s11
        s3 -- "tapC246" --> s11
        s3 -- "tapF252" --> s11
        s3 -- "tapB258" --> s11
        s3 -- "tapD264" --> s11
        s3 -- "tapC270" --> s11
        s3 -- "tapA274" --> s11
        s3 -- "tapE280" --> s11
        s3 -- "tapG286" --> s11
        s3 -- "tapC290" --> s11
        s3 -- "tapG298" --> s11
        s3 -- "tapD302" --> s11
        s3 -- "tapA308" --> s11
        s3 -- "tapF312" --> s11
        s3 -- "tapE318" --> s11
        s3 -- "tapB324" --> s11
        s3 -- "tapA328" --> s11
        s3 -- "tapD332" --> s11
        s3 -- "tapB338" --> s11
        s3 -- "tapE342" --> s11
        s3 -- "tapF348" --> s11
        s3 -- "tapG354" --> s11
        s3 -- "tapC360" --> s11
        s3 -- "tapB370" --> s11
        s3 -- "tapA374" --> s11
        s3 -- "tapD380" --> s11
        s3 -- "tapF384" --> s11
        s3 -- "tapC388" --> s11
        s3 -- "tapE392" --> s11
        s3 -- "tapG396" --> s11
        s3 -- "tapC402" --> s11
        s3 -- "tapG410" --> s11
        s3 -- "tapD414" --> s11
        s3 -- "tapA420" --> s11
        s3 -- "tapF424" --> s11
        s3 -- "tapE430" --> s11
        s3 -- "tapB436" --> s11
        s3 -- "tapB444" --> s11
        s3 -- "tapA448" --> s11
        s3 -- "tapD454" --> s11
        s3 -- "tapF458" --> s11
        s3 -- "tapC462" --> s11
        s3 -- "tapE466" --> s11
        s3 -- "tapG470" --> s11
        s11 -- "tapG12" --> s11
        s11 -- "tapF16" --> s11
        s11 -- "tapA26" --> s11
        s11 -- "tapD30" --> s11
        s11 -- "tapE34" --> s11
        s11 -- "tapB38" --> s11
        s11 -- "tapC42" --> s11
        s11 -- "tapD58" --> s11
        s11 -- "tapF62" --> s11
        s11 -- "tapA68" --> s11
        s11 -- "tapC72" --> s11
        s11 -- "tapB78" --> s11
        s11 -- "tapE82" --> s11
        s11 -- "tapG88" --> s11
        s11 -- "tapF96" --> s11
        s11 -- "tapC104" --> s11
        s11 -- "tapG108" --> s11
        s11 -- "tapA112" --> s11
        s11 -- "tapD116" --> s11
        s11 -- "tapE120" --> s11
        s11 -- "tapB124" --> s11
        s11 -- "tapD132" --> s11
        s11 -- "tapC138" --> s11
        s11 -- "tapE144" --> s11
        s11 -- "tapA150" --> s11
        s11 -- "tapF154" --> s11
        s11 -- "tapB158" --> s11
        s11 -- "tapG162" --> s11
        s11 -- "tapF166" --> s11
        s11 -- "tapB172" --> s11
        s11 -- "tapD178" --> s11
        s11 -- "tapC184" --> s11
        s11 -- "tapA188" --> s11
        s11 -- "tapE194" --> s11
        s11 -- "tapG200" --> s11
        s11 -- "tapA214" --> s11
        s11 -- "tapD218" --> s11
        s11 -- "tapB224" --> s11
        s11 -- "tapE228" --> s11
        s11 -- "tapF234" --> s11
        s11 -- "tapG240" --> s11
        s11 -- "tapC246" --> s11
        s11 -- "tapF252" --> s11
        s11 -- "tapB258" --> s11
        s11 -- "tapD264" --> s11
        s11 -- "tapC270" --> s11
        s11 -- "tapA274" --> s11
        s11 -- "tapE280" --> s11
        s11 -- "tapG286" --> s11
        s11 -- "tapC290" --> s11
        s11 -- "tapG298" --> s11
        s11 -- "tapD302" --> s11
        s11 -- "tapA308" --> s11
        s11 -- "tapF312" --> s11
        s11 -- "tapE318" --> s11
        s11 -- "tapB324" --> s11
        s11 -- "tapA328" --> s11
        s11 -- "tapD332" --> s11
        s11 -- "tapB338" --> s11
        s11 -- "tapE342" --> s11
        s11 -- "tapF348" --> s11
        s11 -- "tapG354" --> s11
        s11 -- "tapC360" --> s11
        s11 -- "tapB370" --> s11
        s11 -- "tapA374" --> s11
        s11 -- "tapD380" --> s11
        s11 -- "tapF384" --> s11
        s11 -- "tapC388" --> s11
        s11 -- "tapE392" --> s11
        s11 -- "tapG396" --> s11
        s11 -- "tapC402" --> s11
        s11 -- "tapG410" --> s11
        s11 -- "tapD414" --> s11
        s11 -- "tapA420" --> s11
        s11 -- "tapF424" --> s11
        s11 -- "tapE430" --> s11
        s11 -- "tapB436" --> s11
        s11 -- "tapB444" --> s11
        s11 -- "tapA448" --> s11
        s11 -- "tapD454" --> s11
        s11 -- "tapF458" --> s11
        s11 -- "tapC462" --> s11
        s11 -- "tapE466" --> s11
        s11 -- "tapG470" --> s11
        
    end
    subgraph Layertab01
        
        
    end
    subgraph LayerControler
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "tapG" --> h00
        h00 -- "tapF" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "tapA" --> h00
        h00 -- "tapD" --> h00
        h00 -- "tapE" --> h00
        h00 -- "tapB" --> h00
        h00 -- "tapC" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "pat" --> h00
        h00 -- "select" --> h00
        h00 -- "tapD" --> h00
        h00 -- "tapF" --> h00
        h00 -- "select" --> h00
        h00 -- "tapA" --> h00
        h00 -- "tapC" --> h00
        h00 -- "select" --> h00
        h00 -- "tapB" --> h00
        h00 -- "tapE" --> h00
        h00 -- "select" --> h00
        h00 -- "tapG" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "tapF" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "tapC" --> h00
        h00 -- "tapG" --> h00
        h00 -- "tapA" --> h00
        h00 -- "tapD" --> h00
        h00 -- "tapE" --> h00
        h00 -- "tapB" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "tapD" --> h00
        h00 -- "select" --> h00
        h00 -- "tapC" --> h00
        h00 -- "select" --> h00
        h00 -- "tapE" --> h00
        h00 -- "select" --> h00
        h00 -- "tapA" --> h00
        h00 -- "tapF" --> h00
        h00 -- "tapB" --> h00
        h00 -- "tapG" --> h00
        h00 -- "tapF" --> h00
        h00 -- "select" --> h00
        h00 -- "tapB" --> h00
        h00 -- "autoStep" --> h00
        h00 -- "tapD" --> h00
        h00 -- "select" --> h00
        h00 -- "tapC" --> h00
        h00 -- "tapA" --> h00
        h00 -- "select" --> h00
        h00 -- "tapE" --> h00
        h00 -- "pat" --> h00
        h00 -- "tapG" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "pat" --> h00
        h00 -- "select" --> h00
        h00 -- "tapA" --> h00
        h00 -- "tapD" --> h00
        h00 -- "autoStep" --> h00
        h00 -- "tapB" --> h00
        h00 -- "tapE" --> h00
        h00 -- "select" --> h00
        h00 -- "tapF" --> h00
        h00 -- "select" --> h00
        h00 -- "tapG" --> h00
        h00 -- "pat" --> h00
        h00 -- "tapC" --> h00
        h00 -- "select" --> h00
        h00 -- "tapF" --> h00
        h00 -- "select" --> h00
        h00 -- "tapB" --> h00
        h00 -- "autoStep" --> h00
        h00 -- "tapD" --> h00
        h00 -- "select" --> h00
        h00 -- "tapC" --> h00
        h00 -- "tapA" --> h00
        h00 -- "select" --> h00
        h00 -- "tapE" --> h00
        h00 -- "pat" --> h00
        h00 -- "tapG" --> h00
        h00 -- "tapC" --> h00
        h00 -- "autoStep" --> h00
        h00 -- "select" --> h00
        h00 -- "tapG" --> h00
        h00 -- "tapD" --> h00
        h00 -- "select" --> h00
        h00 -- "tapA" --> h00
        h00 -- "tapF" --> h00
        h00 -- "pat" --> h00
        h00 -- "tapE" --> h00
        h00 -- "select" --> h00
        h00 -- "tapB" --> h00
        h00 -- "tapA" --> h00
        h00 -- "tapD" --> h00
        h00 -- "autoStep" --> h00
        h00 -- "tapB" --> h00
        h00 -- "tapE" --> h00
        h00 -- "select" --> h00
        h00 -- "tapF" --> h00
        h00 -- "select" --> h00
        h00 -- "tapG" --> h00
        h00 -- "pat" --> h00
        h00 -- "tapC" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "tapB" --> h00
        h00 -- "tapA" --> h00
        h00 -- "pat" --> h00
        h00 -- "tapD" --> h00
        h00 -- "tapF" --> h00
        h00 -- "tapC" --> h00
        h00 -- "tapE" --> h00
        h00 -- "tapG" --> h00
        h00 -- "select" --> h00
        h00 -- "tapC" --> h00
        h00 -- "autoStep" --> h00
        h00 -- "select" --> h00
        h00 -- "tapG" --> h00
        h00 -- "tapD" --> h00
        h00 -- "select" --> h00
        h00 -- "tapA" --> h00
        h00 -- "tapF" --> h00
        h00 -- "pat" --> h00
        h00 -- "tapE" --> h00
        h00 -- "select" --> h00
        h00 -- "tapB" --> h00
        h00 -- "select" --> h00
        h00 -- "select" --> h00
        h00 -- "tapB" --> h00
        h00 -- "tapA" --> h00
        h00 -- "pat" --> h00
        h00 -- "tapD" --> h00
        h00 -- "tapF" --> h00
        h00 -- "tapC" --> h00
        h00 -- "tapE" --> h00
        h00 -- "tapG" --> h00
        h00 -- "select" --> h00
        
    end
    
```
