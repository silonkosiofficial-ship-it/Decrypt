.class final LS/n$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/n;->a(Lx7/a;Landroidx/compose/ui/d;ZLo0/e2;LS/k;LS/m;Lv/g;LA/B;Lz/l;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:J

.field final synthetic E:LA/B;

.field final synthetic F:Lx7/q;


# direct methods
.method constructor <init>(JLA/B;Lx7/q;)V
    .locals 0

    iput-wide p1, p0, LS/n$b;->D:J

    iput-object p3, p0, LS/n$b;->E:LA/B;

    iput-object p4, p0, LS/n$b;->F:Lx7/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 9

    .prologue
    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LV/n;->A()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.Button.<anonymous> (Button.kt:135)"

    const v2, 0x3902db2e

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-wide v3, p0, LS/n$b;->D:J

    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->c(LV/n;I)LS/A1;

    move-result-object p2

    invoke-virtual {p2}, LS/A1;->j()LM0/P;

    move-result-object v5

    new-instance p2, LS/n$b$a;

    iget-object v0, p0, LS/n$b;->E:LA/B;

    iget-object v1, p0, LS/n$b;->F:Lx7/q;

    invoke-direct {p2, v0, v1}, LS/n$b$a;-><init>(LA/B;Lx7/q;)V

    const/16 v0, 0x36

    const v1, 0x4f204156

    const/4 v2, 0x1

    invoke-static {v1, v2, p2, p1, v0}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v6

    const/16 v8, 0x180

    move-object v7, p1

    invoke-static/range {v3 .. v8}, LT/w;->a(JLM0/P;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/n$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
