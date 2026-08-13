.class final LS0/k$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS0/k;->c(Ljava/util/List;LS0/i;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS0/i;

.field final synthetic E:LS0/k;


# direct methods
.method constructor <init>(LS0/i;LS0/k;)V
    .locals 0

    iput-object p1, p0, LS0/k$a;->D:LS0/i;

    iput-object p2, p0, LS0/k$a;->E:LS0/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS0/i;)Ljava/lang/CharSequence;
    .locals 2

    .prologue
    iget-object v0, p0, LS0/k$a;->D:LS0/i;

    if-ne v0, p1, :cond_0

    const-string v0, " > "

    goto :goto_0

    :cond_0
    const-string v0, "   "

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LS0/k$a;->E:LS0/k;

    invoke-static {v0, p1}, LS0/k;->a(LS0/k;LS0/i;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS0/i;

    invoke-virtual {p0, p1}, LS0/k$a;->a(LS0/i;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
