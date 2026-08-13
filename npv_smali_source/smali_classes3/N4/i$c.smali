.class LN4/i$c;
.super LN4/i$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN4/i;->a0()Ljava/util/Iterator;
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

    iput-object p1, p0, LN4/i$c;->G:LN4/i;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LN4/i$e;-><init>(LN4/i;LN4/i$a;)V

    return-void
.end method


# virtual methods
.method c(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN4/i$c;->G:LN4/i;

    invoke-static {v0, p1}, LN4/i;->k(LN4/i;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
