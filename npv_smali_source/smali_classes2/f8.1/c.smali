.class final Lf8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP7/g;


# instance fields
.field private final C:Ln8/c;


# direct methods
.method public constructor <init>(Ln8/c;)V
    .locals 1

    const-string v0, "fqNameToMatch"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf8/c;->C:Ln8/c;

    return-void
.end method


# virtual methods
.method public H(Ln8/c;)Z
    .locals 0

    invoke-static {p0, p1}, LP7/g$b;->b(LP7/g;Ln8/c;)Z

    move-result p1

    return p1
.end method

.method public d(Ln8/c;)Lf8/b;
    .locals 1

    .prologue
    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf8/c;->C:Ln8/c;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lf8/b;->a:Lf8/b;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic j(Ln8/c;)LP7/c;
    .locals 0

    invoke-virtual {p0, p1}, Lf8/c;->d(Ln8/c;)Lf8/b;

    move-result-object p1

    return-object p1
.end method
