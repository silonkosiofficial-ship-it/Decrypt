.class final LS/K$i;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/K;->b(Landroidx/compose/ui/d;Ljava/lang/Long;Lx7/l;LT/f;Lx7/p;Lx7/p;ILS/L;LT/k;Ljava/util/Locale;LS/M;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/Long;

.field final synthetic E:LT/f;

.field final synthetic F:LT/k;

.field final synthetic G:Ljava/util/Locale;


# direct methods
.method constructor <init>(Ljava/lang/Long;LT/f;LT/k;Ljava/util/Locale;)V
    .locals 0

    iput-object p1, p0, LS/K$i;->D:Ljava/lang/Long;

    iput-object p2, p0, LS/K$i;->E:LT/f;

    iput-object p3, p0, LS/K$i;->F:LT/k;

    iput-object p4, p0, LS/K$i;->G:Ljava/util/Locale;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LV/w0;
    .locals 8

    .prologue
    iget-object v0, p0, LS/K$i;->D:Ljava/lang/Long;

    if-eqz v0, :cond_1

    iget-object v1, p0, LS/K$i;->E:LT/f;

    iget-object v2, p0, LS/K$i;->F:LT/k;

    iget-object v3, p0, LS/K$i;->G:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-virtual {v2}, LT/k;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v4, v5, v0, v3}, LT/f;->a(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v2, v0

    goto :goto_2

    :cond_1
    :goto_1
    const-string v0, ""

    goto :goto_0

    :goto_2
    const/4 v0, 0x0

    invoke-static {v0, v0}, LM0/O;->b(II)J

    move-result-wide v3

    new-instance v0, LS0/V;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LS0/V;-><init>(Ljava/lang/String;JLM0/N;ILy7/k;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/K$i;->a()LV/w0;

    move-result-object v0

    return-object v0
.end method
