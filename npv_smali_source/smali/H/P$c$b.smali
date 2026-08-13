.class public final LH/P$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/A;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/P$c;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic a:Lx/A;

.field private final b:LV/G1;

.field private final c:LV/G1;


# direct methods
.method constructor <init>(Lx/A;LH/Q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH/P$c$b;->a:Lx/A;

    new-instance p1, LH/P$c$b$b;

    invoke-direct {p1, p2}, LH/P$c$b$b;-><init>(LH/Q;)V

    invoke-static {p1}, LV/v1;->e(Lx7/a;)LV/G1;

    move-result-object p1

    iput-object p1, p0, LH/P$c$b;->b:LV/G1;

    new-instance p1, LH/P$c$b$a;

    invoke-direct {p1, p2}, LH/P$c$b$a;-><init>(LH/Q;)V

    invoke-static {p1}, LV/v1;->e(Lx7/a;)LV/G1;

    move-result-object p1

    iput-object p1, p0, LH/P$c$b;->c:LV/G1;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, LH/P$c$b;->a:Lx/A;

    invoke-interface {v0}, Lx/A;->a()Z

    move-result v0

    return v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, LH/P$c$b;->c:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, LH/P$c$b;->b:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public d(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LH/P$c$b;->a:Lx/A;

    invoke-interface {v0, p1, p2, p3}, Lx/A;->d(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(F)F
    .locals 1

    iget-object v0, p0, LH/P$c$b;->a:Lx/A;

    invoke-interface {v0, p1}, Lx/A;->e(F)F

    move-result p1

    return p1
.end method
