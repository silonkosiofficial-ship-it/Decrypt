.class final LS/K$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/K;->b(Landroidx/compose/ui/d;Ljava/lang/Long;Lx7/l;LT/f;Lx7/p;Lx7/p;ILS/L;LT/k;Ljava/util/Locale;LS/M;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LT/k;

.field final synthetic E:LV/w0;

.field final synthetic F:Lx7/l;

.field final synthetic G:LT/f;

.field final synthetic H:LS/L;

.field final synthetic I:I

.field final synthetic J:Ljava/util/Locale;

.field final synthetic K:LV/w0;


# direct methods
.method constructor <init>(LT/k;LV/w0;Lx7/l;LT/f;LS/L;ILjava/util/Locale;LV/w0;)V
    .locals 0

    iput-object p1, p0, LS/K$d;->D:LT/k;

    iput-object p2, p0, LS/K$d;->E:LV/w0;

    iput-object p3, p0, LS/K$d;->F:Lx7/l;

    iput-object p4, p0, LS/K$d;->G:LT/f;

    iput-object p5, p0, LS/K$d;->H:LS/L;

    iput p6, p0, LS/K$d;->I:I

    iput-object p7, p0, LS/K$d;->J:Ljava/util/Locale;

    iput-object p8, p0, LS/K$d;->K:LV/w0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS0/V;)V
    .locals 5

    .prologue
    invoke-virtual {p1}, LS0/V;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v1, p0, LS/K$d;->D:LT/k;

    invoke-virtual {v1}, LT/k;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v0, v1, :cond_5

    invoke-virtual {p1}, LS0/V;->i()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LS/K$d;->K:LV/w0;

    invoke-static {v0, p1}, LS/K;->e(LV/w0;LS0/V;)V

    invoke-virtual {p1}, LS0/V;->i()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LS8/r;->u1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v2, p0, LS/K$d;->D:LT/k;

    invoke-virtual {v2}, LT/k;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_3

    :goto_1
    iget-object p1, p0, LS/K$d;->E:LV/w0;

    const-string v0, ""

    invoke-interface {p1, v0}, LV/w0;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, LS/K$d;->F:Lx7/l;

    invoke-interface {p1, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    iget-object v0, p0, LS/K$d;->G:LT/f;

    iget-object v2, p0, LS/K$d;->D:LT/k;

    invoke-virtual {v2}, LT/k;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, LT/f;->k(Ljava/lang/String;Ljava/lang/String;)LT/e;

    move-result-object p1

    iget-object v0, p0, LS/K$d;->E:LV/w0;

    iget-object v2, p0, LS/K$d;->H:LS/L;

    iget v3, p0, LS/K$d;->I:I

    iget-object v4, p0, LS/K$d;->J:Ljava/util/Locale;

    invoke-virtual {v2, p1, v3, v4}, LS/L;->b(LT/e;ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, LV/w0;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, LS/K$d;->F:Lx7/l;

    iget-object v2, p0, LS/K$d;->E:LV/w0;

    invoke-interface {v2}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_4

    if-eqz p1, :cond_4

    invoke-virtual {p1}, LT/e;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :cond_4
    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS0/V;

    invoke-virtual {p0, p1}, LS/K$d;->a(LS0/V;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
