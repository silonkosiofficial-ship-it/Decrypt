.class Lcom/google/firebase/database/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:LQ4/f;

.field private final c:Lw5/a;

.field private final d:Lw5/a;


# direct methods
.method constructor <init>(LQ4/f;LF5/a;LF5/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/database/a;->a:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/firebase/database/a;->b:LQ4/f;

    new-instance p1, Lv5/d;

    invoke-direct {p1, p2}, Lv5/d;-><init>(LF5/a;)V

    iput-object p1, p0, Lcom/google/firebase/database/a;->c:Lw5/a;

    new-instance p1, Lv5/b;

    invoke-direct {p1, p3}, Lv5/b;-><init>(LF5/a;)V

    iput-object p1, p0, Lcom/google/firebase/database/a;->d:Lw5/a;

    return-void
.end method
