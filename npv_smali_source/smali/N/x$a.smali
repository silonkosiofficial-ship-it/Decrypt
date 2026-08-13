.class final LN/x$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/x;->d(LN/k;LN/w;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/K;


# direct methods
.method constructor <init>(Ly7/K;)V
    .locals 0

    iput-object p1, p0, LN/x$a;->D:Ly7/K;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LN/j;)V
    .locals 1

    .prologue
    invoke-virtual {p1}, LN/j;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, LN/x$a;->D:Ly7/K;

    const/4 v0, 0x0

    iput-boolean v0, p1, Ly7/K;->C:Z

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/j;

    invoke-virtual {p0, p1}, LN/x$a;->a(LN/j;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
