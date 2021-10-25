```mermaid
graph LR
    
    subgraph LayercomonTools
        s0 -- "press2" --> s3
        s3 -- "finish6" --> s0
        
    end
    subgraph Layercanvas
        s1 -- "select0" --> s1
        s1 -- "select4" --> s1
        
    end
    subgraph LayerControler
        h00 -- "select" --> h00
        h00 -- "press" --> h00
        h00 -- "select" --> h00
        h00 -- "finish" --> h00
        
    end
    
```

