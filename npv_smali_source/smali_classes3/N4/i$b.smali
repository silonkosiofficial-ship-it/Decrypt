.class LN4/i$b;
.super LN4/i$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN4/i;->B()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic G:LN4/i;


# direct methods
.method constructor <init>(LN4/i;)V
    .locals 1

    iput-object p1, p0, LN4/i$b;->G:LN4/i;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LN4/i$e;-><init>(LN4/i;LN4/i$a;)V

    return-void
.end method


# virtual methods
.method bridge synthetic c(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LN4/i$b;->e(I)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method e(I)Ljava/util/Map$Entry;
    .locals 2

    new-instance v0, LN4/i$g;

    iget-object v1, p0, LN4/i$b;->G:LN4/i;

    invoke-direct {v0, v1, p1}, LN4/i$g;-><init>(LN4/i;I)V

    return-object v0
.end method
