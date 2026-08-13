.class public final LI7/n$g;
.super LI7/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/n;->u(Ly8/h;LI7/n$c;)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>(LI7/n;)V
    .locals 0

    invoke-direct {p0, p1}, LI7/e;-><init>(LI7/n;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(LO7/l;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Li7/M;

    invoke-virtual {p0, p1, p2}, LI7/n$g;->r(LO7/l;Li7/M;)LI7/j;

    move-result-object p1

    return-object p1
.end method

.method public r(LO7/l;Li7/M;)LI7/j;
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No constructors should appear here: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
