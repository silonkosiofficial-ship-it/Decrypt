.class public final Landroidx/compose/ui/platform/r;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements LF0/o0;
.implements Landroidx/compose/ui/platform/H1;
.implements Lz0/Q;
.implements Landroidx/lifecycle/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/r$a;,
        Landroidx/compose/ui/platform/r$b;
    }
.end annotation


# static fields
.field public static final g1:Landroidx/compose/ui/platform/r$a;

.field public static final h1:I

.field private static i1:Ljava/lang/Class;

.field private static j1:Ljava/lang/reflect/Method;


# instance fields
.field private A0:J

.field private B0:Z

.field private C:J

.field private final C0:LV/w0;

.field private D:Z

.field private final D0:LV/G1;

.field private final E:LF0/L;

.field private E0:Lx7/l;

.field private final F:LV/w0;

.field private final F0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private final G:LK0/e;

.field private final G0:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private final H:Landroidx/compose/ui/semantics/EmptySemanticsElement;

.field private final H0:Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;

.field private final I:Lm0/i;

.field private final I0:LS0/Z;

.field private final J:Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;

.field private final J0:LS0/X;

.field private K:Lm7/i;

.field private final K0:Ljava/util/concurrent/atomic/AtomicReference;

.field private final L:Lk0/c;

.field private final L0:Landroidx/compose/ui/platform/s1;

.field private final M:Landroidx/compose/ui/platform/K1;

.field private final M0:LR0/g;

.field private final N:Landroidx/compose/ui/d;

.field private final N0:LV/w0;

.field private final O:Landroidx/compose/ui/d;

.field private O0:I

.field private final P:Lo0/r0;

.field private final P0:LV/w0;

.field private final Q:LF0/J;

.field private final Q0:Lv0/a;

.field private final R:LF0/x0;

.field private final R0:Lw0/c;

.field private final S:LK0/q;

.field private final S0:LE0/f;

.field private final T:Landroidx/compose/ui/platform/x;

.field private final T0:Landroidx/compose/ui/platform/t1;

.field private U:Lj0/b;

.field private U0:Landroid/view/MotionEvent;

.field private final V:Landroidx/compose/ui/platform/j;

.field private V0:J

.field private final W:Lo0/C1;

.field private final W0:Landroidx/compose/ui/platform/I1;

.field private final X0:LX/b;

.field private final Y0:Landroidx/compose/ui/platform/r$u;

.field private final Z0:Ljava/lang/Runnable;

.field private final a0:Li0/w;

.field private a1:Z

.field private final b0:Ljava/util/List;

.field private final b1:Lx7/a;

.field private c0:Ljava/util/List;

.field private final c1:Landroidx/compose/ui/platform/h0;

.field private d0:Z

.field private d1:Z

.field private e0:Z

.field private final e1:LJ0/l;

.field private final f0:Lz0/i;

.field private final f1:Lz0/y;

.field private final g0:Lz0/F;

.field private h0:Lx7/l;

.field private final i0:Li0/d;

.field private j0:Z

.field private final k0:Landroidx/compose/ui/platform/k;

.field private final l0:LF0/q0;

.field private m0:Z

.field private n0:Landroidx/compose/ui/platform/f0;

.field private o0:Landroidx/compose/ui/platform/w0;

.field private p0:LY0/b;

.field private q0:Z

.field private final r0:LF0/V;

.field private final s0:Landroidx/compose/ui/platform/A1;

.field private t0:J

.field private final u0:[I

.field private final v0:[F

.field private final w0:[F

.field private final x0:[F

.field private y0:J

.field private z0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/r$a;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/ui/platform/r;->g1:Landroidx/compose/ui/platform/r$a;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/platform/r;->h1:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm7/i;)V
    .locals 13

    .prologue
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->b()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/platform/r;->C:J

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/compose/ui/platform/r;->D:Z

    new-instance v2, LF0/L;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v1, v3}, LF0/L;-><init>(Lq0/a;ILy7/k;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->E:LF0/L;

    invoke-static {p1}, LY0/a;->a(Landroid/content/Context;)LY0/e;

    move-result-object v2

    invoke-static {}, LV/v1;->m()LV/u1;

    move-result-object v4

    invoke-static {v2, v4}, LV/v1;->h(Ljava/lang/Object;LV/u1;)LV/w0;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->F:LV/w0;

    new-instance v2, LK0/e;

    invoke-direct {v2}, LK0/e;-><init>()V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->G:LK0/e;

    new-instance v4, Landroidx/compose/ui/semantics/EmptySemanticsElement;

    invoke-direct {v4, v2}, Landroidx/compose/ui/semantics/EmptySemanticsElement;-><init>(LK0/e;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->H:Landroidx/compose/ui/semantics/EmptySemanticsElement;

    new-instance v12, Landroidx/compose/ui/focus/FocusOwnerImpl;

    new-instance v6, Landroidx/compose/ui/platform/r$i;

    invoke-direct {v6, p0}, Landroidx/compose/ui/platform/r$i;-><init>(Ljava/lang/Object;)V

    new-instance v7, Landroidx/compose/ui/platform/r$j;

    invoke-direct {v7, p0}, Landroidx/compose/ui/platform/r$j;-><init>(Ljava/lang/Object;)V

    new-instance v8, Landroidx/compose/ui/platform/r$k;

    invoke-direct {v8, p0}, Landroidx/compose/ui/platform/r$k;-><init>(Ljava/lang/Object;)V

    new-instance v9, Landroidx/compose/ui/platform/r$l;

    invoke-direct {v9, p0}, Landroidx/compose/ui/platform/r$l;-><init>(Ljava/lang/Object;)V

    new-instance v10, Landroidx/compose/ui/platform/r$m;

    invoke-direct {v10, p0}, Landroidx/compose/ui/platform/r$m;-><init>(Ljava/lang/Object;)V

    new-instance v11, Landroidx/compose/ui/platform/r$n;

    invoke-direct {v11, p0}, Landroidx/compose/ui/platform/r$n;-><init>(Ljava/lang/Object;)V

    move-object v5, v12

    invoke-direct/range {v5 .. v11}, Landroidx/compose/ui/focus/FocusOwnerImpl;-><init>(Lx7/l;Lx7/p;Lx7/l;Lx7/a;Lx7/a;Lx7/a;)V

    iput-object v12, p0, Landroidx/compose/ui/platform/r;->I:Lm0/i;

    new-instance v5, Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;

    new-instance v6, Landroidx/compose/ui/platform/r$h;

    invoke-direct {v6, p0}, Landroidx/compose/ui/platform/r$h;-><init>(Ljava/lang/Object;)V

    invoke-direct {v5, v6}, Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;-><init>(Lx7/q;)V

    iput-object v5, p0, Landroidx/compose/ui/platform/r;->J:Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;

    iput-object p2, p0, Landroidx/compose/ui/platform/r;->K:Lm7/i;

    iput-object v5, p0, Landroidx/compose/ui/platform/r;->L:Lk0/c;

    new-instance p2, Landroidx/compose/ui/platform/K1;

    invoke-direct {p2}, Landroidx/compose/ui/platform/K1;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/r;->M:Landroidx/compose/ui/platform/K1;

    sget-object p2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    new-instance v6, Landroidx/compose/ui/platform/r$p;

    invoke-direct {v6, p0}, Landroidx/compose/ui/platform/r$p;-><init>(Landroidx/compose/ui/platform/r;)V

    invoke-static {p2, v6}, Landroidx/compose/ui/input/key/a;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v6

    iput-object v6, p0, Landroidx/compose/ui/platform/r;->N:Landroidx/compose/ui/d;

    sget-object v7, Landroidx/compose/ui/platform/r$v;->D:Landroidx/compose/ui/platform/r$v;

    invoke-static {p2, v7}, Landroidx/compose/ui/input/rotary/a;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v7

    iput-object v7, p0, Landroidx/compose/ui/platform/r;->O:Landroidx/compose/ui/d;

    new-instance v8, Lo0/r0;

    invoke-direct {v8}, Lo0/r0;-><init>()V

    iput-object v8, p0, Landroidx/compose/ui/platform/r;->P:Lo0/r0;

    new-instance v8, LF0/J;

    const/4 v9, 0x3

    const/4 v10, 0x0

    invoke-direct {v8, v10, v10, v9, v3}, LF0/J;-><init>(ZIILy7/k;)V

    sget-object v9, LD0/b0;->b:LD0/b0;

    invoke-virtual {v8, v9}, LF0/J;->e(LD0/I;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getDensity()LY0/e;

    move-result-object v9

    invoke-virtual {v8, v9}, LF0/J;->a(LY0/e;)V

    invoke-virtual {p2, v4}, Landroidx/compose/ui/d$a;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    invoke-interface {p2, v7}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    invoke-interface {p2, v6}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lm0/i;

    move-result-object v4

    invoke-interface {v4}, Lm0/i;->b()Landroidx/compose/ui/d;

    move-result-object v4

    invoke-interface {p2, v4}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    invoke-virtual {v5}, Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;->d()Landroidx/compose/ui/d;

    move-result-object v4

    invoke-interface {p2, v4}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    invoke-virtual {v8, p2}, LF0/J;->g(Landroidx/compose/ui/d;)V

    iput-object v8, p0, Landroidx/compose/ui/platform/r;->Q:LF0/J;

    iput-object p0, p0, Landroidx/compose/ui/platform/r;->R:LF0/x0;

    new-instance p2, LK0/q;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object v4

    invoke-direct {p2, v4, v2}, LK0/q;-><init>(LF0/J;LK0/e;)V

    iput-object p2, p0, Landroidx/compose/ui/platform/r;->S:LK0/q;

    new-instance p2, Landroidx/compose/ui/platform/x;

    invoke-direct {p2, p0}, Landroidx/compose/ui/platform/x;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object p2, p0, Landroidx/compose/ui/platform/r;->T:Landroidx/compose/ui/platform/x;

    new-instance v2, Lj0/b;

    new-instance v4, Landroidx/compose/ui/platform/r$f;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/r$f;-><init>(Ljava/lang/Object;)V

    invoke-direct {v2, p0, v4}, Lj0/b;-><init>(Landroidx/compose/ui/platform/r;Lx7/a;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->U:Lj0/b;

    new-instance v2, Landroidx/compose/ui/platform/j;

    invoke-direct {v2, p1}, Landroidx/compose/ui/platform/j;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->V:Landroidx/compose/ui/platform/j;

    invoke-static {p0}, Lo0/M;->a(Landroid/view/ViewGroup;)Lo0/C1;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->W:Lo0/C1;

    new-instance v2, Li0/w;

    invoke-direct {v2}, Li0/w;-><init>()V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->a0:Li0/w;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->b0:Ljava/util/List;

    new-instance v2, Lz0/i;

    invoke-direct {v2}, Lz0/i;-><init>()V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->f0:Lz0/i;

    new-instance v2, Lz0/F;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object v4

    invoke-direct {v2, v4}, Lz0/F;-><init>(LF0/J;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->g0:Lz0/F;

    sget-object v2, Landroidx/compose/ui/platform/r$e;->D:Landroidx/compose/ui/platform/r$e;

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->h0:Lx7/l;

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->a0()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Li0/d;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAutofillTree()Li0/w;

    move-result-object v4

    invoke-direct {v2, p0, v4}, Li0/d;-><init>(Landroid/view/View;Li0/w;)V

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    iput-object v2, p0, Landroidx/compose/ui/platform/r;->i0:Li0/d;

    new-instance v2, Landroidx/compose/ui/platform/k;

    invoke-direct {v2, p1}, Landroidx/compose/ui/platform/k;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->k0:Landroidx/compose/ui/platform/k;

    new-instance v2, LF0/q0;

    new-instance v4, Landroidx/compose/ui/platform/r$w;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/r$w;-><init>(Landroidx/compose/ui/platform/r;)V

    invoke-direct {v2, v4}, LF0/q0;-><init>(Lx7/l;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->l0:LF0/q0;

    new-instance v2, LF0/V;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object v4

    invoke-direct {v2, v4}, LF0/V;-><init>(LF0/J;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    new-instance v2, Landroidx/compose/ui/platform/b0;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v4

    invoke-direct {v2, v4}, Landroidx/compose/ui/platform/b0;-><init>(Landroid/view/ViewConfiguration;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->s0:Landroidx/compose/ui/platform/A1;

    const v2, 0x7fffffff

    invoke-static {v2, v2}, LY0/q;->a(II)J

    move-result-wide v6

    iput-wide v6, p0, Landroidx/compose/ui/platform/r;->t0:J

    filled-new-array {v10, v10}, [I

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->u0:[I

    invoke-static {v3, v1, v3}, Lo0/J1;->c([FILy7/k;)[F

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->v0:[F

    invoke-static {v3, v1, v3}, Lo0/J1;->c([FILy7/k;)[F

    move-result-object v4

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->w0:[F

    invoke-static {v3, v1, v3}, Lo0/J1;->c([FILy7/k;)[F

    move-result-object v4

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->x0:[F

    const-wide/16 v6, -0x1

    iput-wide v6, p0, Landroidx/compose/ui/platform/r;->y0:J

    invoke-virtual {v0}, Ln0/g$a;->a()J

    move-result-wide v6

    iput-wide v6, p0, Landroidx/compose/ui/platform/r;->A0:J

    iput-boolean v1, p0, Landroidx/compose/ui/platform/r;->B0:Z

    const/4 v0, 0x2

    invoke-static {v3, v3, v0, v3}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v4

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->C0:LV/w0;

    new-instance v4, Landroidx/compose/ui/platform/r$z;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/r$z;-><init>(Landroidx/compose/ui/platform/r;)V

    invoke-static {v4}, LV/v1;->e(Lx7/a;)LV/G1;

    move-result-object v4

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->D0:LV/G1;

    new-instance v4, Landroidx/compose/ui/platform/n;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/n;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->F0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    new-instance v4, Landroidx/compose/ui/platform/o;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/o;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->G0:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    new-instance v4, Landroidx/compose/ui/platform/p;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/p;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->H0:Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;

    new-instance v4, LS0/Z;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getView()Landroid/view/View;

    move-result-object v6

    invoke-direct {v4, v6, p0}, LS0/Z;-><init>(Landroid/view/View;Lz0/Q;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->I0:LS0/Z;

    new-instance v6, LS0/X;

    invoke-static {}, Landroidx/compose/ui/platform/S;->h()Lx7/l;

    move-result-object v7

    invoke-interface {v7, v4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LS0/P;

    invoke-direct {v6, v4}, LS0/X;-><init>(LS0/P;)V

    iput-object v6, p0, Landroidx/compose/ui/platform/r;->J0:LS0/X;

    invoke-static {}, Lh0/o;->a()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v4

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->K0:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v4, Landroidx/compose/ui/platform/r0;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getTextInputService()LS0/X;

    move-result-object v6

    invoke-direct {v4, v6}, Landroidx/compose/ui/platform/r0;-><init>(LS0/X;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->L0:Landroidx/compose/ui/platform/s1;

    new-instance v4, Landroidx/compose/ui/platform/U;

    invoke-direct {v4, p1}, Landroidx/compose/ui/platform/U;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->M0:LR0/g;

    invoke-static {p1}, LR0/l;->a(Landroid/content/Context;)LR0/h$b;

    move-result-object v4

    invoke-static {}, LV/v1;->m()LV/u1;

    move-result-object v6

    invoke-static {v4, v6}, LV/v1;->h(Ljava/lang/Object;LV/u1;)LV/w0;

    move-result-object v4

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->N0:LV/w0;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    invoke-direct {p0, v4}, Landroidx/compose/ui/platform/r;->l0(Landroid/content/res/Configuration;)I

    move-result v4

    iput v4, p0, Landroidx/compose/ui/platform/r;->O0:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/f;->e(I)LY0/v;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, LY0/v;->C:LY0/v;

    :cond_1
    invoke-static {p1, v3, v0, v3}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->P0:LV/w0;

    new-instance p1, Lv0/c;

    invoke-direct {p1, p0}, Lv0/c;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->Q0:Lv0/a;

    new-instance p1, Lw0/c;

    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lw0/a;->b:Lw0/a$a;

    invoke-virtual {v0}, Lw0/a$a;->b()I

    move-result v0

    goto :goto_1

    :cond_2
    sget-object v0, Lw0/a;->b:Lw0/a$a;

    invoke-virtual {v0}, Lw0/a$a;->a()I

    move-result v0

    :goto_1
    new-instance v4, Landroidx/compose/ui/platform/r$c;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/r$c;-><init>(Landroidx/compose/ui/platform/r;)V

    invoke-direct {p1, v0, v4, v3}, Lw0/c;-><init>(ILx7/l;Ly7/k;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->R0:Lw0/c;

    new-instance p1, LE0/f;

    invoke-direct {p1, p0}, LE0/f;-><init>(LF0/o0;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->S0:LE0/f;

    new-instance p1, Landroidx/compose/ui/platform/W;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/W;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->T0:Landroidx/compose/ui/platform/t1;

    new-instance p1, Landroidx/compose/ui/platform/I1;

    invoke-direct {p1}, Landroidx/compose/ui/platform/I1;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->W0:Landroidx/compose/ui/platform/I1;

    new-instance p1, LX/b;

    const/16 v0, 0x10

    new-array v0, v0, [Lx7/a;

    invoke-direct {p1, v0, v10}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->X0:LX/b;

    new-instance p1, Landroidx/compose/ui/platform/r$u;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/r$u;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->Y0:Landroidx/compose/ui/platform/r$u;

    new-instance p1, Landroidx/compose/ui/platform/q;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/q;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->Z0:Ljava/lang/Runnable;

    new-instance p1, Landroidx/compose/ui/platform/r$t;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/r$t;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->b1:Lx7/a;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-ge p1, v0, :cond_3

    new-instance v4, Landroidx/compose/ui/platform/i0;

    invoke-direct {v4, v2, v3}, Landroidx/compose/ui/platform/i0;-><init>([FLy7/k;)V

    goto :goto_2

    :cond_3
    new-instance v4, Landroidx/compose/ui/platform/k0;

    invoke-direct {v4}, Landroidx/compose/ui/platform/k0;-><init>()V

    :goto_2
    iput-object v4, p0, Landroidx/compose/ui/platform/r;->c1:Landroidx/compose/ui/platform/h0;

    iget-object v2, p0, Landroidx/compose/ui/platform/r;->U:Lj0/b;

    invoke-virtual {p0, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {p0, v10}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    const/16 v2, 0x1a

    if-lt p1, v2, :cond_4

    sget-object v2, Landroidx/compose/ui/platform/Q;->a:Landroidx/compose/ui/platform/Q;

    invoke-virtual {v2, p0, v1, v10}, Landroidx/compose/ui/platform/Q;->a(Landroid/view/View;IZ)V

    :cond_4
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {p0, v10}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-static {p0, p2}, Landroidx/core/view/X;->n0(Landroid/view/View;Landroidx/core/view/a;)V

    sget-object p2, Landroidx/compose/ui/platform/H1;->k:Landroidx/compose/ui/platform/H1$a;

    invoke-virtual {p2}, Landroidx/compose/ui/platform/H1$a;->a()Lx7/l;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-interface {p2, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-virtual {p0, v5}, Landroid/view/View;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object p2

    invoke-virtual {p2, p0}, LF0/J;->u(LF0/o0;)V

    if-lt p1, v0, :cond_6

    sget-object p2, Landroidx/compose/ui/platform/D;->a:Landroidx/compose/ui/platform/D;

    invoke-virtual {p2, p0}, Landroidx/compose/ui/platform/D;->a(Landroid/view/View;)V

    :cond_6
    const/16 p2, 0x1f

    if-lt p1, p2, :cond_7

    new-instance v3, LJ0/l;

    invoke-direct {v3}, LJ0/l;-><init>()V

    :cond_7
    iput-object v3, p0, Landroidx/compose/ui/platform/r;->e1:LJ0/l;

    new-instance p1, Landroidx/compose/ui/platform/r$q;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/r$q;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->f1:Lz0/y;

    return-void
.end method

.method public static synthetic A(Landroidx/compose/ui/platform/r;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/r;->M0(Landroidx/compose/ui/platform/r;)V

    return-void
.end method

.method private final A0(I)Z
    .locals 4

    .prologue
    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/d;->l(II)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_5

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->c()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/focus/d;->l(II)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p1}, Landroidx/compose/ui/focus/f;->c(I)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->z0()Ln0/i;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lo0/X1;->b(Ln0/i;)Landroid/graphics/Rect;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v1

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v1, p0, v3, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-virtual {v1, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocusFromRect(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v1, p1, v0}, Landroidx/compose/ui/focus/f;->b(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z

    move-result v2

    :cond_3
    return v2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid focus direction"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    return v2
.end method

.method public static synthetic B(Landroidx/compose/ui/platform/r;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/r;->L0(Landroidx/compose/ui/platform/r;)V

    return-void
.end method

.method private final B0(Landroidx/compose/ui/focus/d;Ln0/i;)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d;->o()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/f;->c(I)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_1
    const/16 p1, 0x82

    :goto_0
    if-eqz p2, :cond_2

    invoke-static {p2}, Lo0/X1;->b(Ln0/i;)Landroid/graphics/Rect;

    move-result-object p2

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    :goto_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1

    :cond_3
    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic C(Landroidx/compose/ui/platform/r;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/r;->m0(Landroidx/compose/ui/platform/r;)V

    return-void
.end method

.method private final C0(II)J
    .locals 2

    int-to-long v0, p1

    invoke-static {v0, v1}, Li7/G;->g(J)J

    move-result-wide v0

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    invoke-static {v0, v1}, Li7/G;->g(J)J

    move-result-wide v0

    int-to-long p1, p2

    invoke-static {p1, p2}, Li7/G;->g(J)J

    move-result-wide p1

    or-long/2addr p1, v0

    invoke-static {p1, p2}, Li7/G;->g(J)J

    move-result-wide p1

    return-wide p1
.end method

.method private final D0()V
    .locals 6

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->z0:Z

    if-nez v0, :cond_1

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Landroidx/compose/ui/platform/r;->y0:J

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iput-wide v0, p0, Landroidx/compose/ui/platform/r;->y0:J

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->F0()V

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    move-object v1, p0

    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    move-object v0, v1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->u0:[I

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->u0:[I

    const/4 v2, 0x0

    aget v3, v0, v2

    int-to-float v3, v3

    const/4 v4, 0x1

    aget v5, v0, v4

    int-to-float v5, v5

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->u0:[I

    aget v1, v0, v2

    int-to-float v1, v1

    aget v0, v0, v4

    int-to-float v0, v0

    sub-float/2addr v3, v1

    sub-float/2addr v5, v0

    invoke-static {v3, v5}, Ln0/h;->a(FF)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/r;->A0:J

    :cond_1
    return-void
.end method

.method public static final synthetic E(Landroidx/compose/ui/platform/r;ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/platform/r;->Z(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V

    return-void
.end method

.method private final E0(Landroid/view/MotionEvent;)V
    .locals 4

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/r;->y0:J

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->F0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->w0:[F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-static {v1, v2}, Ln0/h;->a(FF)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo0/J1;->f([FJ)J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    invoke-static {v0, v1}, Ln0/g;->m(J)F

    move-result v3

    sub-float/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    invoke-static {v0, v1}, Ln0/g;->n(J)F

    move-result v0

    sub-float/2addr p1, v0

    invoke-static {v2, p1}, Ln0/h;->a(FF)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/r;->A0:J

    return-void
.end method

.method public static final synthetic F(Landroidx/compose/ui/platform/r;Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method private final F0()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->c1:Landroidx/compose/ui/platform/h0;

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->w0:[F

    invoke-interface {v0, p0, v1}, Landroidx/compose/ui/platform/h0;->a(Landroid/view/View;[F)V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->w0:[F

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->x0:[F

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/I0;->a([F[F)Z

    return-void
.end method

.method public static final synthetic G(Landroidx/compose/ui/platform/r;I)Landroid/view/View;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->i0(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic I(Landroidx/compose/ui/platform/r;)Landroidx/compose/ui/platform/x;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/r;->T:Landroidx/compose/ui/platform/x;

    return-object p0
.end method

.method public static final synthetic J()Ljava/lang/reflect/Method;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/r;->j1:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method private final J0(LF0/J;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz p1, :cond_1

    :goto_0
    if-eqz p1, :cond_0

    invoke-virtual {p1}, LF0/J;->g0()LF0/J$g;

    move-result-object v0

    sget-object v1, LF0/J$g;->C:LF0/J$g;

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->d0(LF0/J;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LF0/J;->o0()LF0/J;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object v0

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_4
    :goto_2
    return-void
.end method

.method public static final synthetic K(Landroidx/compose/ui/platform/r;)Landroid/view/MotionEvent;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/r;->U0:Landroid/view/MotionEvent;

    return-object p0
.end method

.method static synthetic K0(Landroidx/compose/ui/platform/r;LF0/J;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->J0(LF0/J;)V

    return-void
.end method

.method public static final synthetic L(Landroidx/compose/ui/platform/r;)J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/platform/r;->V0:J

    return-wide v0
.end method

.method private static final L0(Landroidx/compose/ui/platform/r;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->S0()V

    return-void
.end method

.method public static final synthetic M(Landroidx/compose/ui/platform/r;)Landroidx/compose/ui/platform/r$u;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/r;->Y0:Landroidx/compose/ui/platform/r$u;

    return-object p0
.end method

.method private static final M0(Landroidx/compose/ui/platform/r;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/platform/r;->a1:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->U0:Landroid/view/MotionEvent;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->N0(Landroid/view/MotionEvent;)I

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "The ACTION_HOVER_EXIT event was not cleared."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic N()Ljava/lang/Class;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/r;->i1:Ljava/lang/Class;

    return-object v0
.end method

.method private final N0(Landroid/view/MotionEvent;)I
    .locals 5

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->d1:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Landroidx/compose/ui/platform/r;->d1:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->M:Landroidx/compose/ui/platform/K1;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v2

    invoke-static {v2}, Lz0/O;->b(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroidx/compose/ui/platform/K1;->b(I)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->f0:Lz0/i;

    invoke-virtual {v0, p1, p0}, Lz0/i;->c(Landroid/view/MotionEvent;Lz0/Q;)Lz0/D;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lz0/D;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_3

    :goto_0
    add-int/lit8 v3, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lz0/E;

    invoke-virtual {v4}, Lz0/E;->b()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    if-gez v3, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    goto :goto_0

    :cond_3
    :goto_1
    const/4 v2, 0x0

    :goto_2
    check-cast v2, Lz0/E;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lz0/E;->f()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/platform/r;->C:J

    :cond_4
    iget-object v1, p0, Landroidx/compose/ui/platform/r;->g0:Lz0/F;

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->v0(Landroid/view/MotionEvent;)Z

    move-result v2

    invoke-virtual {v1, v0, p0, v2}, Lz0/F;->b(Lz0/D;Lz0/Q;Z)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    if-eqz v1, :cond_5

    const/4 v2, 0x5

    if-ne v1, v2, :cond_7

    :cond_5
    invoke-static {v0}, Lz0/S;->c(I)Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->f0:Lz0/i;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    invoke-virtual {v1, p1}, Lz0/i;->e(I)V

    goto :goto_3

    :cond_6
    iget-object p1, p0, Landroidx/compose/ui/platform/r;->g0:Lz0/F;

    invoke-virtual {p1}, Lz0/F;->c()V

    invoke-static {v1, v1}, Lz0/G;->a(ZZ)I

    move-result v0

    :cond_7
    :goto_3
    return v0
.end method

.method public static final synthetic O(Landroidx/compose/ui/platform/r;)Landroidx/compose/ui/platform/r$b;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->get_viewTreeOwners()Landroidx/compose/ui/platform/r$b;

    move-result-object p0

    return-object p0
.end method

.method private final O0(Landroid/view/MotionEvent;IJZ)V
    .locals 18

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v5, p2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v15, 0x1

    if-eq v2, v15, :cond_1

    const/4 v6, 0x6

    if-eq v2, v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    goto :goto_0

    :cond_1
    const/16 v2, 0x9

    if-eq v5, v2, :cond_2

    const/16 v2, 0xa

    if-eq v5, v2, :cond_2

    move v3, v4

    :cond_2
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    if-ltz v3, :cond_3

    move v6, v15

    goto :goto_1

    :cond_3
    move v6, v4

    :goto_1
    sub-int v6, v2, v6

    if-nez v6, :cond_4

    return-void

    :cond_4
    new-array v7, v6, [Landroid/view/MotionEvent$PointerProperties;

    move v2, v4

    :goto_2
    if-ge v2, v6, :cond_5

    new-instance v8, Landroid/view/MotionEvent$PointerProperties;

    invoke-direct {v8}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    aput-object v8, v7, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    new-array v8, v6, [Landroid/view/MotionEvent$PointerCoords;

    move v2, v4

    :goto_3
    if-ge v2, v6, :cond_6

    new-instance v9, Landroid/view/MotionEvent$PointerCoords;

    invoke-direct {v9}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    aput-object v9, v8, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    move v2, v4

    :goto_4
    if-ge v2, v6, :cond_9

    if-ltz v3, :cond_8

    if-ge v2, v3, :cond_7

    goto :goto_5

    :cond_7
    move v9, v15

    goto :goto_6

    :cond_8
    :goto_5
    move v9, v4

    :goto_6
    add-int/2addr v9, v2

    aget-object v10, v7, v2

    invoke-virtual {v1, v9, v10}, Landroid/view/MotionEvent;->getPointerProperties(ILandroid/view/MotionEvent$PointerProperties;)V

    aget-object v10, v8, v2

    invoke-virtual {v1, v9, v10}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    iget v9, v10, Landroid/view/MotionEvent$PointerCoords;->x:F

    iget v11, v10, Landroid/view/MotionEvent$PointerCoords;->y:F

    invoke-static {v9, v11}, Ln0/h;->a(FF)J

    move-result-wide v11

    invoke-virtual {v0, v11, v12}, Landroidx/compose/ui/platform/r;->j(J)J

    move-result-wide v11

    invoke-static {v11, v12}, Ln0/g;->m(J)F

    move-result v9

    iput v9, v10, Landroid/view/MotionEvent$PointerCoords;->x:F

    invoke-static {v11, v12}, Ln0/g;->n(J)F

    move-result v9

    iput v9, v10, Landroid/view/MotionEvent$PointerCoords;->y:F

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_9
    if-eqz p5, :cond_a

    move v10, v4

    goto :goto_7

    :cond_a
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v2

    move v10, v2

    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v11

    cmp-long v2, v2, v11

    if-nez v2, :cond_b

    move-wide/from16 v2, p3

    goto :goto_8

    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v2

    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getXPrecision()F

    move-result v11

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getYPrecision()F

    move-result v12

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v16

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getFlags()I

    move-result v17

    move-wide v1, v2

    move-wide/from16 v3, p3

    move/from16 v5, p2

    move/from16 v15, v16

    move/from16 v16, v17

    invoke-static/range {v1 .. v16}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    move-result-object v1

    iget-object v2, v0, Landroidx/compose/ui/platform/r;->f0:Lz0/i;

    invoke-virtual {v2, v1, v0}, Lz0/i;->c(Landroid/view/MotionEvent;Lz0/Q;)Lz0/D;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v3, v0, Landroidx/compose/ui/platform/r;->g0:Lz0/F;

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v0, v4}, Lz0/F;->b(Lz0/D;Lz0/Q;Z)I

    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    return-void
.end method

.method public static final synthetic P(Landroidx/compose/ui/platform/r;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->y0()V

    return-void
.end method

.method static synthetic P0(Landroidx/compose/ui/platform/r;Landroid/view/MotionEvent;IJZILjava/lang/Object;)V
    .locals 6

    .prologue
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p5, 0x1

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/r;->O0(Landroid/view/MotionEvent;IJZ)V

    return-void
.end method

.method public static final synthetic Q(Landroidx/compose/ui/platform/r;)Ln0/i;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->z0()Ln0/i;

    move-result-object p0

    return-object p0
.end method

.method private final Q0(Lk0/h;JLx7/l;)Z
    .locals 8

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    invoke-static {v1, v0}, LY0/g;->a(FF)LY0/e;

    move-result-object v3

    new-instance v0, Lk0/a;

    const/4 v7, 0x0

    move-object v2, v0

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v2 .. v7}, Lk0/a;-><init>(LY0/e;JLx7/l;Ly7/k;)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x18

    if-lt p2, p3, :cond_0

    sget-object p2, Landroidx/compose/ui/platform/E;->a:Landroidx/compose/ui/platform/E;

    invoke-virtual {p2, p0, p1, v0}, Landroidx/compose/ui/platform/E;->a(Landroid/view/View;Lk0/h;Lk0/a;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method public static final synthetic R(Landroidx/compose/ui/platform/r;I)Z
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->A0(I)Z

    move-result p0

    return p0
.end method

.method private static final R0(Landroidx/compose/ui/platform/r;Z)V
    .locals 0

    .prologue
    iget-object p0, p0, Landroidx/compose/ui/platform/r;->R0:Lw0/c;

    if-eqz p1, :cond_0

    sget-object p1, Lw0/a;->b:Lw0/a$a;

    invoke-virtual {p1}, Lw0/a$a;->b()I

    move-result p1

    goto :goto_0

    :cond_0
    sget-object p1, Lw0/a;->b:Lw0/a$a;

    invoke-virtual {p1}, Lw0/a$a;->a()I

    move-result p1

    :goto_0
    invoke-virtual {p0, p1}, Lw0/c;->b(I)V

    return-void
.end method

.method public static final synthetic S(Landroidx/compose/ui/platform/r;Landroidx/compose/ui/focus/d;Ln0/i;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/platform/r;->B0(Landroidx/compose/ui/focus/d;Ln0/i;)Z

    move-result p0

    return p0
.end method

.method private final S0()V
    .locals 8

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->u0:[I

    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-wide v0, p0, Landroidx/compose/ui/platform/r;->t0:J

    invoke-static {v0, v1}, LY0/p;->h(J)I

    move-result v2

    invoke-static {v0, v1}, LY0/p;->i(J)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->u0:[I

    const/4 v3, 0x0

    aget v4, v1, v3

    const/4 v5, 0x1

    if-ne v2, v4, :cond_0

    aget v6, v1, v5

    if-eq v0, v6, :cond_1

    :cond_0
    aget v1, v1, v5

    invoke-static {v4, v1}, LY0/q;->a(II)J

    move-result-wide v6

    iput-wide v6, p0, Landroidx/compose/ui/platform/r;->t0:J

    const v1, 0x7fffffff

    if-eq v2, v1, :cond_1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->V()LF0/O;

    move-result-object v0

    invoke-virtual {v0}, LF0/O;->I()LF0/O$b;

    move-result-object v0

    invoke-virtual {v0}, LF0/O$b;->B1()V

    move v3, v5

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {v0, v3}, LF0/V;->c(Z)V

    return-void
.end method

.method public static final synthetic T(Landroidx/compose/ui/platform/r;Landroid/view/MotionEvent;IJZ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/compose/ui/platform/r;->O0(Landroid/view/MotionEvent;IJZ)V

    return-void
.end method

.method public static final synthetic U(Ljava/lang/reflect/Method;)V
    .locals 0

    sput-object p0, Landroidx/compose/ui/platform/r;->j1:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static final synthetic V(Landroidx/compose/ui/platform/r;J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/r;->V0:J

    return-void
.end method

.method public static final synthetic W(Ljava/lang/Class;)V
    .locals 0

    sput-object p0, Landroidx/compose/ui/platform/r;->i1:Ljava/lang/Class;

    return-void
.end method

.method public static final synthetic X(Landroidx/compose/ui/platform/r;Lk0/h;JLx7/l;)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/ui/platform/r;->Q0(Lk0/h;JLx7/l;)Z

    move-result p0

    return p0
.end method

.method private final Z(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->T:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x;->c0()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->T:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x;->e0()Lr/A;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Lr/k;->e(II)I

    move-result p1

    if-eq p1, v1, :cond_1

    :goto_0
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p2, p3, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->T:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x;->b0()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->T:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x;->d0()Lr/A;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Lr/k;->e(II)I

    move-result p1

    if-eq p1, v1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private final a0()Z
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final d0(LF0/J;)Z
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->q0:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, LF0/J;->o0()LF0/J;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LF0/J;->N()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private final e0(Landroid/view/ViewGroup;)V
    .locals 4

    .prologue
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroidx/compose/ui/platform/r;

    if-eqz v3, :cond_0

    check-cast v2, Landroidx/compose/ui/platform/r;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/r;->r()V

    goto :goto_1

    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-direct {p0, v2}, Landroidx/compose/ui/platform/r;->e0(Landroid/view/ViewGroup;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final f0(I)J
    .locals 3

    .prologue
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, -0x80000000

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    if-eqz v0, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1, p1}, Landroidx/compose/ui/platform/r;->C0(II)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    const p1, 0x7fffffff

    :cond_2
    invoke-direct {p0, v2, p1}, Landroidx/compose/ui/platform/r;->C0(II)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method private final g0()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->e0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->dispatchOnGlobalLayout()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/platform/r;->e0:Z

    :cond_0
    return-void
.end method

.method public static synthetic getFontLoader$annotations()V
    .locals 0
    .annotation runtime Li7/e;
    .end annotation

    return-void
.end method

.method public static synthetic getLastMatrixRecalculationAnimationTime$ui_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getShowLayoutBounds$annotations()V
    .locals 0

    return-void
.end method

.method private final get_viewTreeOwners()Landroidx/compose/ui/platform/r$b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->C0:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/r$b;

    return-object v0
.end method

.method private final i0(I)Landroid/view/View;
    .locals 4

    .prologue
    move-object v0, p0

    :cond_0
    if-eqz v0, :cond_1

    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v1, v2, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0, v0}, Landroidx/compose/ui/platform/S;->a(Landroid/view/View;Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private final j0(ILandroid/view/View;)Landroid/view/View;
    .locals 4

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x0

    if-ge v0, v1, :cond_2

    const-class v0, Landroid/view/View;

    const-string v1, "getAccessibilityViewId"

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, p2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p2, Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-direct {p0, p1, v3}, Landroidx/compose/ui/platform/r;->j0(ILandroid/view/View;)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method private final l0(Landroid/content/res/Configuration;)I
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p1}, Landroidx/compose/ui/platform/m;->a(Landroid/content/res/Configuration;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private static final m0(Landroidx/compose/ui/platform/r;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->S0()V

    return-void
.end method

.method private final n0(Landroid/view/MotionEvent;)I
    .locals 17

    .prologue
    move-object/from16 v9, p0

    move-object/from16 v0, p1

    iget-object v1, v9, Landroidx/compose/ui/platform/r;->Y0:Landroidx/compose/ui/platform/r$u;

    invoke-virtual {v9, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v10, 0x0

    :try_start_0
    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/platform/r;->E0(Landroid/view/MotionEvent;)V

    const/4 v11, 0x1

    iput-boolean v11, v9, Landroidx/compose/ui/platform/r;->z0:Z

    invoke-virtual {v9, v10}, Landroidx/compose/ui/platform/r;->a(Z)V

    const-string v1, "AndroidOwner:onTouch"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v12

    iget-object v13, v9, Landroidx/compose/ui/platform/r;->U0:Landroid/view/MotionEvent;

    const/4 v14, 0x3

    if-eqz v13, :cond_0

    invoke-virtual {v13, v10}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v1

    if-ne v1, v14, :cond_0

    move v15, v11

    goto :goto_0

    :cond_0
    move v15, v10

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :goto_0
    const/16 v8, 0xa

    if-eqz v13, :cond_1

    invoke-direct {v9, v0, v13}, Landroidx/compose/ui/platform/r;->p0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {v9, v13}, Landroidx/compose/ui/platform/r;->u0(Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v9, Landroidx/compose/ui/platform/r;->g0:Lz0/F;

    invoke-virtual {v1}, Lz0/F;->c()V

    :cond_1
    move v11, v8

    goto :goto_1

    :cond_2
    invoke-virtual {v13}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    if-eq v1, v8, :cond_1

    if-eqz v15, :cond_1

    invoke-virtual {v13}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    const/16 v7, 0x8

    const/16 v16, 0x0

    const/16 v3, 0xa

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object v2, v13

    move v11, v8

    move-object/from16 v8, v16

    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/platform/r;->P0(Landroidx/compose/ui/platform/r;Landroid/view/MotionEvent;IJZILjava/lang/Object;)V

    :goto_1
    invoke-virtual {v0, v10}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v1

    if-ne v1, v14, :cond_3

    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    move v1, v10

    :goto_2
    const/16 v8, 0x9

    if-nez v15, :cond_4

    if-eqz v1, :cond_4

    if-eq v12, v14, :cond_4

    if-eq v12, v8, :cond_4

    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/platform/r;->v0(Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    const/16 v7, 0x8

    const/4 v12, 0x0

    const/16 v3, 0x9

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v14, v8

    move-object v8, v12

    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/platform/r;->P0(Landroidx/compose/ui/platform/r;Landroid/view/MotionEvent;IJZILjava/lang/Object;)V

    goto :goto_3

    :cond_4
    move v14, v8

    :goto_3
    if-eqz v13, :cond_5

    invoke-virtual {v13}, Landroid/view/MotionEvent;->recycle()V

    :cond_5
    iget-object v1, v9, Landroidx/compose/ui/platform/r;->U0:Landroid/view/MotionEvent;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-ne v1, v11, :cond_f

    iget-object v1, v9, Landroidx/compose/ui/platform/r;->U0:Landroid/view/MotionEvent;

    if-eqz v1, :cond_6

    invoke-virtual {v1, v10}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    goto :goto_4

    :cond_6
    const/4 v1, -0x1

    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-ne v2, v14, :cond_7

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v2

    if-nez v2, :cond_7

    if-ltz v1, :cond_f

    iget-object v2, v9, Landroidx/compose/ui/platform/r;->f0:Lz0/i;

    invoke-virtual {v2, v1}, Lz0/i;->e(I)V

    goto :goto_9

    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_f

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v2

    if-nez v2, :cond_f

    iget-object v2, v9, Landroidx/compose/ui/platform/r;->U0:Landroid/view/MotionEvent;

    const/high16 v3, 0x7fc00000    # Float.NaN

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    goto :goto_5

    :cond_8
    move v2, v3

    :goto_5
    iget-object v4, v9, Landroidx/compose/ui/platform/r;->U0:Landroid/view/MotionEvent;

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    cmpg-float v2, v2, v4

    if-nez v2, :cond_a

    cmpg-float v2, v3, v5

    if-nez v2, :cond_a

    move v2, v10

    goto :goto_6

    :cond_a
    const/4 v2, 0x1

    :goto_6
    iget-object v3, v9, Landroidx/compose/ui/platform/r;->U0:Landroid/view/MotionEvent;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v3

    goto :goto_7

    :cond_b
    const-wide/16 v3, -0x1

    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-eqz v3, :cond_c

    const/4 v11, 0x1

    goto :goto_8

    :cond_c
    move v11, v10

    :goto_8
    if-nez v2, :cond_d

    if-eqz v11, :cond_f

    :cond_d
    if-ltz v1, :cond_e

    iget-object v2, v9, Landroidx/compose/ui/platform/r;->f0:Lz0/i;

    invoke-virtual {v2, v1}, Lz0/i;->e(I)V

    :cond_e
    iget-object v1, v9, Landroidx/compose/ui/platform/r;->g0:Lz0/F;

    invoke-virtual {v1}, Lz0/F;->a()V

    :cond_f
    :goto_9
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    iput-object v1, v9, Landroidx/compose/ui/platform/r;->U0:Landroid/view/MotionEvent;

    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/platform/r;->N0(Landroid/view/MotionEvent;)I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iput-boolean v10, v9, Landroidx/compose/ui/platform/r;->z0:Z

    return v0

    :catchall_1
    move-exception v0

    goto :goto_b

    :goto_a
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_b
    iput-boolean v10, v9, Landroidx/compose/ui/platform/r;->z0:Z

    throw v0
.end method

.method private final o0(Landroid/view/MotionEvent;)Z
    .locals 9

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    const/16 v1, 0x1a

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    neg-float v1, v1

    new-instance v8, LB0/b;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/core/view/b0;->j(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result v2

    mul-float v3, v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/core/view/b0;->f(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result v0

    mul-float v4, v1, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v7

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LB0/b;-><init>(FFJI)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lm0/i;

    move-result-object p1

    invoke-interface {p1, v8}, Lm0/i;->c(LB0/b;)Z

    move-result p1

    return p1
.end method

.method private final p0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result p2

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result p1

    if-eq p2, p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method private final r0(LF0/J;)V
    .locals 3

    .prologue
    invoke-virtual {p1}, LF0/J;->E0()V

    invoke-virtual {p1}, LF0/J;->w0()LX/b;

    move-result-object p1

    invoke-virtual {p1}, LX/b;->t()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    :cond_0
    aget-object v2, p1, v1

    check-cast v2, LF0/J;

    invoke-direct {p0, v2}, Landroidx/compose/ui/platform/r;->r0(LF0/J;)V

    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :cond_1
    return-void
.end method

.method private final s0(LF0/J;)V
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, LF0/V;->G(LF0/V;LF0/J;ZILjava/lang/Object;)Z

    invoke-virtual {p1}, LF0/J;->w0()LX/b;

    move-result-object p1

    invoke-virtual {p1}, LX/b;->t()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object p1

    :cond_0
    aget-object v1, p1, v3

    check-cast v1, LF0/J;

    invoke-direct {p0, v1}, Landroidx/compose/ui/platform/r;->s0(LF0/J;)V

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v0, :cond_0

    :cond_1
    return-void
.end method

.method private setDensity(LY0/e;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->F:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private setFontFamilyResolver(LR0/h$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->N0:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private setLayoutDirection(LY0/v;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->P0:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final set_viewTreeOwners(Landroidx/compose/ui/platform/r$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->C0:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final t0(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    move v4, v3

    :goto_1
    if-ge v4, v1, :cond_3

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt v0, v5, :cond_1

    sget-object v0, Landroidx/compose/ui/platform/M0;->a:Landroidx/compose/ui/platform/M0;

    invoke-virtual {v0, p1, v4}, Landroidx/compose/ui/platform/M0;->a(Landroid/view/MotionEvent;I)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    move v0, v2

    goto :goto_3

    :cond_2
    :goto_2
    move v0, v3

    :goto_3
    if-nez v0, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    return v0
.end method

.method private final u0(Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    const/4 v1, 0x0

    :cond_1
    return v1
.end method

.method private final v0(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    const/4 v1, 0x0

    cmpg-float v2, v1, v0

    if-gtz v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    cmpg-float v0, v1, p1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final w0(Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->U0:Landroid/view/MotionEvent;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v3

    if-ne v2, v3, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    cmpg-float v2, v2, v3

    if-nez v2, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    cmpg-float p1, p1, v0

    if-nez p1, :cond_1

    const/4 v1, 0x0

    :cond_1
    return v1
.end method

.method private final y0()V
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/view/ViewGroup;->clearFocus()V

    :cond_1
    return-void
.end method

.method public static synthetic z(Landroidx/compose/ui/platform/r;Z)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/r;->R0(Landroidx/compose/ui/platform/r;Z)V

    return-void
.end method

.method private final z0()Ln0/i;
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lm0/i;

    move-result-object v0

    invoke-interface {v0}, Lm0/i;->h()Ln0/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Landroidx/compose/ui/focus/f;->a(Landroid/view/View;)Ln0/i;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public synthetic D(Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->b(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    return-void
.end method

.method public final G0(LF0/m0;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->o0:Landroidx/compose/ui/platform/w0;

    if-eqz v0, :cond_0

    sget-object v0, Landroidx/compose/ui/platform/B1;->R:Landroidx/compose/ui/platform/B1$c;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/B1$c;->b()Z

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->W0:Landroidx/compose/ui/platform/I1;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/I1;->c(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public synthetic H(Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->e(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    return-void
.end method

.method public final H0(Landroidx/compose/ui/viewinterop/c;)V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/r$r;

    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/platform/r$r;-><init>(Landroidx/compose/ui/platform/r;Landroidx/compose/ui/viewinterop/c;)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/r;->x(Lx7/a;)V

    return-void
.end method

.method public final I0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/r;->j0:Z

    return-void
.end method

.method public final Y(Landroidx/compose/ui/viewinterop/c;LF0/J;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/f0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/f0;->getHolderToLayoutNode()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/f0;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/f0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/f0;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    new-instance v0, Landroidx/compose/ui/platform/r$d;

    invoke-direct {v0, p0, p2, p0}, Landroidx/compose/ui/platform/r$d;-><init>(Landroidx/compose/ui/platform/r;LF0/J;Landroidx/compose/ui/platform/r;)V

    invoke-static {p1, v0}, Landroidx/core/view/X;->n0(Landroid/view/View;Landroidx/core/view/a;)V

    return-void
.end method

.method public a(Z)V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {v0}, LF0/V;->m()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {v0}, LF0/V;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    const-string v0, "AndroidOwner:measureAndLayout"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    :try_start_0
    iget-object p1, p0, Landroidx/compose/ui/platform/r;->b1:Lx7/a;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_0
    iget-object v1, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {v1, p1}, LF0/V;->r(Lx7/a;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_2
    iget-object p1, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v2, v0}, LF0/V;->d(LF0/V;ZILjava/lang/Object;)V

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->g0()V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    :cond_3
    return-void

    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public addView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/platform/r;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public addView(Landroid/view/View;I)V
    .locals 1

    .prologue
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    :cond_0
    invoke-virtual {p0, p1, p2, v0}, Landroidx/compose/ui/platform/r;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public addView(Landroid/view/View;II)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput p3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    sget-object p2, Li7/M;->a:Li7/M;

    const/4 p2, -0x1

    invoke-virtual {p0, p1, p2, v0}, Landroidx/compose/ui/platform/r;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0, p2}, Landroidx/compose/ui/platform/r;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public autofill(Landroid/util/SparseArray;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->i0:Li0/d;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Li0/f;->a(Li0/d;Landroid/util/SparseArray;)V

    :cond_0
    return-void
.end method

.method public b(LF0/J;)V
    .locals 0

    return-void
.end method

.method public final b0(Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->T:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/x;->M(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public c(J)J
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->D0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->w0:[F

    invoke-static {v0, p1, p2}, Lo0/J1;->f([FJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final c0(Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->U:Lj0/b;

    invoke-virtual {v0, p1}, Lj0/b;->b(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public canScrollHorizontally(I)Z
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->T:Landroidx/compose/ui/platform/x;

    const/4 v1, 0x0

    iget-wide v2, p0, Landroidx/compose/ui/platform/r;->C:J

    invoke-virtual {v0, v1, p1, v2, v3}, Landroidx/compose/ui/platform/x;->N(ZIJ)Z

    move-result p1

    return p1
.end method

.method public canScrollVertically(I)Z
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->T:Landroidx/compose/ui/platform/x;

    const/4 v1, 0x1

    iget-wide v2, p0, Landroidx/compose/ui/platform/r;->C:J

    invoke-virtual {v0, v1, p1, v2, v3}, Landroidx/compose/ui/platform/x;->N(ZIJ)Z

    move-result p1

    return p1
.end method

.method public d(J)J
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->D0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->x0:[F

    invoke-static {v0, p1, p2}, Lo0/J1;->f([FJ)J

    move-result-wide p1

    return-wide p1
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->r0(LF0/J;)V

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, LF0/n0;->c(LF0/o0;ZILjava/lang/Object;)V

    sget-object v3, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v3}, Lf0/k$a;->n()V

    iput-boolean v1, p0, Landroidx/compose/ui/platform/r;->d0:Z

    iget-object v3, p0, Landroidx/compose/ui/platform/r;->P:Lo0/r0;

    invoke-virtual {v3}, Lo0/r0;->a()Lo0/G;

    move-result-object v4

    invoke-virtual {v4}, Lo0/G;->a()Landroid/graphics/Canvas;

    move-result-object v4

    invoke-virtual {v3}, Lo0/r0;->a()Lo0/G;

    move-result-object v5

    invoke-virtual {v5, p1}, Lo0/G;->w(Landroid/graphics/Canvas;)V

    invoke-virtual {v3}, Lo0/r0;->a()Lo0/G;

    move-result-object v5

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object v6

    invoke-virtual {v6, v5, v2}, LF0/J;->B(Lo0/q0;Lr0/c;)V

    invoke-virtual {v3}, Lo0/r0;->a()Lo0/G;

    move-result-object v2

    invoke-virtual {v2, v4}, Lo0/G;->w(Landroid/graphics/Canvas;)V

    iget-object v2, p0, Landroidx/compose/ui/platform/r;->b0:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v1, v2

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->b0:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v3, p0, Landroidx/compose/ui/platform/r;->b0:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF0/m0;

    invoke-interface {v3}, LF0/m0;->j()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object v1, Landroidx/compose/ui/platform/B1;->R:Landroidx/compose/ui/platform/B1$c;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/B1$c;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v2, v2}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_2
    iget-object p1, p0, Landroidx/compose/ui/platform/r;->b0:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iput-boolean v0, p0, Landroidx/compose/ui/platform/r;->d0:Z

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->c0:Ljava/util/List;

    if-eqz p1, :cond_3

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->b0:Ljava/util/List;

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_3
    return-void
.end method

.method public dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->a1:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->Z0:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/platform/r;->a1:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->Z0:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-ne v0, v1, :cond_4

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->t0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const/high16 v0, 0x400000

    invoke-virtual {p1, v0}, Landroid/view/InputEvent;->isFromSource(I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->o0(Landroid/view/MotionEvent;)Z

    move-result p1

    goto :goto_2

    :cond_3
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->n0(Landroid/view/MotionEvent;)I

    move-result p1

    invoke-static {p1}, Lz0/S;->c(I)Z

    move-result p1

    goto :goto_2

    :cond_4
    :goto_1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    :goto_2
    return p1
.end method

.method public dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->a1:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->Z0:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->Z0:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->t0(Landroid/view/MotionEvent;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->T:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/x;->V(Landroid/view/MotionEvent;)Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x7

    if-eq v0, v2, :cond_5

    const/16 v2, 0xa

    if-eq v0, v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->v0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->U0:Landroid/view/MotionEvent;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    :cond_4
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->U0:Landroid/view/MotionEvent;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/platform/r;->a1:Z

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->Z0:Ljava/lang/Runnable;

    const-wide/16 v2, 0x8

    invoke-virtual {p0, p1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return v1

    :cond_5
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->w0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_6

    return v1

    :cond_6
    :goto_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->n0(Landroid/view/MotionEvent;)I

    move-result p1

    invoke-static {p1}, Lz0/S;->c(I)Z

    move-result p1

    return p1

    :cond_7
    :goto_1
    return v1
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 4

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->M:Landroidx/compose/ui/platform/K1;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v1

    invoke-static {v1}, Lz0/O;->b(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/K1;->b(I)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lm0/i;

    move-result-object v0

    invoke-static {p1}, Lx0/b;->b(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lm0/h;->a(Lm0/i;Landroid/view/KeyEvent;Lx7/a;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lm0/i;

    move-result-object v0

    invoke-static {p1}, Lx0/b;->b(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;

    move-result-object v1

    new-instance v2, Landroidx/compose/ui/platform/r$g;

    invoke-direct {v2, p0, p1}, Landroidx/compose/ui/platform/r$g;-><init>(Landroidx/compose/ui/platform/r;Landroid/view/KeyEvent;)V

    invoke-interface {v0, v1, v2}, Lm0/i;->j(Landroid/view/KeyEvent;Lx7/a;)Z

    move-result p1

    :goto_1
    return p1
.end method

.method public dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lm0/i;

    move-result-object v0

    invoke-static {p1}, Lx0/b;->b(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;

    move-result-object v1

    invoke-interface {v0, v1}, Lm0/i;->l(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public dispatchProvideStructure(Landroid/view/ViewStructure;)V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_0

    sget-object v0, Landroidx/compose/ui/platform/B;->a:Landroidx/compose/ui/platform/B;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroidx/compose/ui/platform/B;->a(Landroid/view/ViewStructure;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchProvideStructure(Landroid/view/ViewStructure;)V

    :goto_0
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->a1:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->Z0:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->U0:Landroid/view/MotionEvent;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-nez v2, :cond_1

    invoke-direct {p0, p1, v0}, Landroidx/compose/ui/platform/r;->p0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Landroidx/compose/ui/platform/r;->a1:Z

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->Z0:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_2
    :goto_1
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->t0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->w0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->n0(Landroid/view/MotionEvent;)I

    move-result p1

    invoke-static {p1}, Lz0/S;->b(I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_5
    invoke-static {p1}, Lz0/S;->c(I)Z

    move-result p1

    return p1

    :cond_6
    :goto_2
    return v1
.end method

.method public e(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/platform/r;->e0:Z

    return-void
.end method

.method public f(Landroidx/lifecycle/r;)V
    .locals 0

    sget-object p1, Landroidx/compose/ui/platform/r;->g1:Landroidx/compose/ui/platform/r$a;

    invoke-static {p1}, Landroidx/compose/ui/platform/r$a;->a(Landroidx/compose/ui/platform/r$a;)Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/r;->setShowLayoutBounds(Z)V

    return-void
.end method

.method public final findViewByAccessibilityIdTraversal(I)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v3, v4, :cond_0

    const-class v3, Landroid/view/View;

    const-string v4, "findViewByAccessibilityIdTraversal"

    new-array v5, v1, [Ljava/lang/Class;

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v5, v0

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    invoke-virtual {v3, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/view/View;

    move-object v2, p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p0}, Landroidx/compose/ui/platform/r;->j0(ILandroid/view/View;)Landroid/view/View;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-object v2
.end method

.method public focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 4

    .prologue
    if-eqz p1, :cond_1

    invoke-static {p1}, Landroidx/compose/ui/focus/f;->a(Landroid/view/View;)Ln0/i;

    move-result-object v0

    invoke-static {p2}, Landroidx/compose/ui/focus/f;->d(I)Landroidx/compose/ui/focus/d;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/ui/focus/d;->o()I

    move-result v1

    goto :goto_0

    :cond_0
    sget-object v1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v1}, Landroidx/compose/ui/focus/d$a;->a()I

    move-result v1

    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lm0/i;

    move-result-object v2

    sget-object v3, Landroidx/compose/ui/platform/r$o;->D:Landroidx/compose/ui/platform/r$o;

    invoke-interface {v2, v1, v0, v3}, Lm0/i;->o(ILn0/i;Lx7/l;)Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public synthetic g(Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->a(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    return-void
.end method

.method public bridge synthetic getAccessibilityManager()Landroidx/compose/ui/platform/i;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAccessibilityManager()Landroidx/compose/ui/platform/j;

    move-result-object v0

    return-object v0
.end method

.method public getAccessibilityManager()Landroidx/compose/ui/platform/j;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->V:Landroidx/compose/ui/platform/j;

    return-object v0
.end method

.method public final getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/f0;
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->n0:Landroidx/compose/ui/platform/f0;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/compose/ui/platform/f0;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/f0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/r;->n0:Landroidx/compose/ui/platform/f0;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/r;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->n0:Landroidx/compose/ui/platform/f0;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method public getAutofill()Li0/g;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->i0:Li0/d;

    return-object v0
.end method

.method public getAutofillTree()Li0/w;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->a0:Li0/w;

    return-object v0
.end method

.method public getClipboardManager()Landroidx/compose/ui/platform/k;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->k0:Landroidx/compose/ui/platform/k;

    return-object v0
.end method

.method public bridge synthetic getClipboardManager()Landroidx/compose/ui/platform/m0;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getClipboardManager()Landroidx/compose/ui/platform/k;

    move-result-object v0

    return-object v0
.end method

.method public final getConfigurationChangeObserver()Lx7/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/l;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->h0:Lx7/l;

    return-object v0
.end method

.method public final getContentCaptureManager$ui_release()Lj0/b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->U:Lj0/b;

    return-object v0
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->K:Lm7/i;

    return-object v0
.end method

.method public getDensity()LY0/e;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->F:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/e;

    return-object v0
.end method

.method public getDragAndDropManager()Lk0/c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->L:Lk0/c;

    return-object v0
.end method

.method public getFocusOwner()Lm0/i;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->I:Lm0/i;

    return-object v0
.end method

.method public getFocusedRect(Landroid/graphics/Rect;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->z0()Ln0/i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln0/i;->i()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->left:I

    invoke-virtual {v0}, Ln0/i;->l()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0}, Ln0/i;->j()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->right:I

    invoke-virtual {v0}, Ln0/i;->e()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    sget-object v0, Li7/M;->a:Li7/M;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->getFocusedRect(Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method

.method public getFontFamilyResolver()LR0/h$b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->N0:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR0/h$b;

    return-object v0
.end method

.method public getFontLoader()LR0/g;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->M0:LR0/g;

    return-object v0
.end method

.method public getGraphicsContext()Lo0/C1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->W:Lo0/C1;

    return-object v0
.end method

.method public getHapticFeedBack()Lv0/a;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->Q0:Lv0/a;

    return-object v0
.end method

.method public getHasPendingMeasureOrLayout()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {v0}, LF0/V;->m()Z

    move-result v0

    return v0
.end method

.method public getInputModeManager()Lw0/b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->R0:Lw0/c;

    return-object v0
.end method

.method public final getLastMatrixRecalculationAnimationTime$ui_release()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/platform/r;->y0:J

    return-wide v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->P0:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/v;

    return-object v0
.end method

.method public getMeasureIteration()J
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {v0}, LF0/V;->q()J

    move-result-wide v0

    return-wide v0
.end method

.method public getModifierLocalManager()LE0/f;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->S0:LE0/f;

    return-object v0
.end method

.method public getPlacementScope()LD0/X$a;
    .locals 1

    invoke-static {p0}, LD0/Y;->b(LF0/o0;)LD0/X$a;

    move-result-object v0

    return-object v0
.end method

.method public getPointerIconService()Lz0/y;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->f1:Lz0/y;

    return-object v0
.end method

.method public getRoot()LF0/J;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->Q:LF0/J;

    return-object v0
.end method

.method public getRootForTest()LF0/x0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->R:LF0/x0;

    return-object v0
.end method

.method public final getScrollCaptureInProgress$ui_release()Z
    .locals 3

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->e1:LJ0/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LJ0/l;->c()Z

    move-result v2

    :cond_0
    return v2
.end method

.method public getSemanticsOwner()LK0/q;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->S:LK0/q;

    return-object v0
.end method

.method public getSharedDrawScope()LF0/L;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->E:LF0/L;

    return-object v0
.end method

.method public getShowLayoutBounds()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->m0:Z

    return v0
.end method

.method public getSnapshotObserver()LF0/q0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->l0:LF0/q0;

    return-object v0
.end method

.method public getSoftwareKeyboardController()Landroidx/compose/ui/platform/s1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->L0:Landroidx/compose/ui/platform/s1;

    return-object v0
.end method

.method public getTextInputService()LS0/X;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->J0:LS0/X;

    return-object v0
.end method

.method public getTextToolbar()Landroidx/compose/ui/platform/t1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->T0:Landroidx/compose/ui/platform/t1;

    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public getViewConfiguration()Landroidx/compose/ui/platform/A1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->s0:Landroidx/compose/ui/platform/A1;

    return-object v0
.end method

.method public final getViewTreeOwners()Landroidx/compose/ui/platform/r$b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->D0:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/r$b;

    return-object v0
.end method

.method public getWindowInfo()Landroidx/compose/ui/platform/J1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->M:Landroidx/compose/ui/platform/K1;

    return-object v0
.end method

.method public h(LF0/J;ZZ)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {p2, p1, p3}, LF0/V;->B(LF0/J;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    invoke-static {p0, v1, v0, v1}, Landroidx/compose/ui/platform/r;->K0(Landroidx/compose/ui/platform/r;LF0/J;ILjava/lang/Object;)V

    goto :goto_1

    :cond_0
    iget-object p2, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {p2, p1, p3}, LF0/V;->E(LF0/J;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final h0(Landroidx/compose/ui/viewinterop/c;Landroid/graphics/Canvas;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/f0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/f0;->a(Landroidx/compose/ui/viewinterop/c;Landroid/graphics/Canvas;)V

    return-void
.end method

.method public j(J)J
    .locals 3

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->D0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->w0:[F

    invoke-static {v0, p1, p2}, Lo0/J1;->f([FJ)J

    move-result-wide p1

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v0

    iget-wide v1, p0, Landroidx/compose/ui/platform/r;->A0:J

    invoke-static {v1, v2}, Ln0/g;->m(J)F

    move-result v1

    add-float/2addr v0, v1

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    iget-wide v1, p0, Landroidx/compose/ui/platform/r;->A0:J

    invoke-static {v1, v2}, Ln0/g;->n(J)F

    move-result p2

    add-float/2addr p1, p2

    invoke-static {v0, p1}, Ln0/h;->a(FF)J

    move-result-wide p1

    return-wide p1
.end method

.method public k([F)V
    .locals 3

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->D0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->w0:[F

    invoke-static {p1, v0}, Lo0/J1;->n([F[F)V

    iget-wide v0, p0, Landroidx/compose/ui/platform/r;->A0:J

    invoke-static {v0, v1}, Ln0/g;->m(J)F

    move-result v0

    iget-wide v1, p0, Landroidx/compose/ui/platform/r;->A0:J

    invoke-static {v1, v2}, Ln0/g;->n(J)F

    move-result v1

    iget-object v2, p0, Landroidx/compose/ui/platform/r;->v0:[F

    invoke-static {p1, v0, v1, v2}, Landroidx/compose/ui/platform/S;->d([FFF[F)V

    return-void
.end method

.method public k0(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/d;
    .locals 6

    .prologue
    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v0

    sget-object v2, Lx0/a;->b:Lx0/a$a;

    invoke-virtual {v2}, Lx0/a$a;->l()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Lx0/a;->p(JJ)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1}, Lx0/d;->f(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->f()I

    move-result p1

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->e()I

    move-result p1

    :goto_0
    invoke-static {p1}, Landroidx/compose/ui/focus/d;->i(I)Landroidx/compose/ui/focus/d;

    move-result-object p1

    goto/16 :goto_6

    :cond_1
    invoke-virtual {v2}, Lx0/a$a;->e()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Lx0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->g()I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lx0/a$a;->d()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Lx0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->d()I

    move-result p1

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Lx0/a$a;->f()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Lx0/a;->p(JJ)Z

    move-result p1

    const/4 v3, 0x1

    if-eqz p1, :cond_4

    move p1, v3

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Lx0/a$a;->k()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lx0/a;->p(JJ)Z

    move-result p1

    :goto_1
    if-eqz p1, :cond_5

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->h()I

    move-result p1

    goto :goto_0

    :cond_5
    invoke-virtual {v2}, Lx0/a$a;->c()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lx0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_6

    move p1, v3

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Lx0/a$a;->j()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lx0/a;->p(JJ)Z

    move-result p1

    :goto_2
    if-eqz p1, :cond_7

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->a()I

    move-result p1

    goto :goto_0

    :cond_7
    invoke-virtual {v2}, Lx0/a$a;->b()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lx0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_8

    move p1, v3

    goto :goto_3

    :cond_8
    invoke-virtual {v2}, Lx0/a$a;->g()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lx0/a;->p(JJ)Z

    move-result p1

    :goto_3
    if-eqz p1, :cond_9

    move p1, v3

    goto :goto_4

    :cond_9
    invoke-virtual {v2}, Lx0/a$a;->i()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lx0/a;->p(JJ)Z

    move-result p1

    :goto_4
    if-eqz p1, :cond_a

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->b()I

    move-result p1

    goto/16 :goto_0

    :cond_a
    invoke-virtual {v2}, Lx0/a$a;->a()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lx0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v2}, Lx0/a$a;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lx0/a;->p(JJ)Z

    move-result v3

    :goto_5
    if-eqz v3, :cond_c

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->c()I

    move-result p1

    goto/16 :goto_0

    :cond_c
    const/4 p1, 0x0

    :goto_6
    return-object p1
.end method

.method public l(LF0/J;J)V
    .locals 1

    .prologue
    const-string v0, "AndroidOwner:measureAndLayout"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {v0, p1, p2, p3}, LF0/V;->s(LF0/J;J)V

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {p1}, LF0/V;->m()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    const/4 p2, 0x1

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, p3}, LF0/V;->d(LF0/V;ZILjava/lang/Object;)V

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->g0()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public m(LF0/J;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {v0, p1}, LF0/V;->v(LF0/J;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->I0()V

    return-void
.end method

.method public n(LF0/J;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {v0, p1}, LF0/V;->D(LF0/J;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p1}, Landroidx/compose/ui/platform/r;->K0(Landroidx/compose/ui/platform/r;LF0/J;ILjava/lang/Object;)V

    return-void
.end method

.method public synthetic o(Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->c(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 5

    .prologue
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->M:Landroidx/compose/ui/platform/K1;

    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/K1;->c(Z)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->s0(LF0/J;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->r0(LF0/J;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getSnapshotObserver()LF0/q0;

    move-result-object v0

    invoke-virtual {v0}, LF0/q0;->k()V

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->i0:Li0/d;

    if-eqz v0, :cond_0

    sget-object v1, Li0/v;->a:Li0/v;

    invoke-virtual {v1, v0}, Li0/v;->a(Li0/d;)V

    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/Z;->a(Landroid/view/View;)Landroidx/lifecycle/r;

    move-result-object v0

    invoke-static {p0}, Lx2/g;->a(Landroid/view/View;)Lx2/f;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getViewTreeOwners()Landroidx/compose/ui/platform/r$b;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    invoke-virtual {v2}, Landroidx/compose/ui/platform/r$b;->a()Landroidx/lifecycle/r;

    move-result-object v4

    if-ne v0, v4, :cond_1

    invoke-virtual {v2}, Landroidx/compose/ui/platform/r$b;->a()Landroidx/lifecycle/r;

    move-result-object v4

    if-eq v1, v4, :cond_4

    :cond_1
    if-eqz v0, :cond_a

    if-eqz v1, :cond_9

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroidx/compose/ui/platform/r$b;->a()Landroidx/lifecycle/r;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v2}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2, p0}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    :cond_2
    invoke-interface {v0}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    new-instance v2, Landroidx/compose/ui/platform/r$b;

    invoke-direct {v2, v0, v1}, Landroidx/compose/ui/platform/r$b;-><init>(Landroidx/lifecycle/r;Lx2/f;)V

    invoke-direct {p0, v2}, Landroidx/compose/ui/platform/r;->set_viewTreeOwners(Landroidx/compose/ui/platform/r$b;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->E0:Lx7/l;

    if-eqz v0, :cond_3

    invoke-interface {v0, v2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iput-object v3, p0, Landroidx/compose/ui/platform/r;->E0:Lx7/l;

    :cond_4
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->R0:Lw0/c;

    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lw0/a;->b:Lw0/a$a;

    invoke-virtual {v1}, Lw0/a$a;->b()I

    move-result v1

    goto :goto_0

    :cond_5
    sget-object v1, Lw0/a;->b:Lw0/a$a;

    invoke-virtual {v1}, Lw0/a$a;->a()I

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Lw0/c;->b(I)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getViewTreeOwners()Landroidx/compose/ui/platform/r$b;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r$b;->a()Landroidx/lifecycle/r;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {v0}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object v3

    :cond_6
    if-eqz v3, :cond_8

    invoke-virtual {v3, p0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->U:Lj0/b;

    invoke-virtual {v3, v0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->F0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->G0:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->H0:Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_7

    sget-object v0, Landroidx/compose/ui/platform/J;->a:Landroidx/compose/ui/platform/J;

    invoke-virtual {v0, p0}, Landroidx/compose/ui/platform/J;->b(Landroid/view/View;)V

    :cond_7
    return-void

    :cond_8
    const-string v0, "No lifecycle owner exists"

    invoke-static {v0}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composed into the View which doesn\'t propagateViewTreeSavedStateRegistryOwner!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composed into the View which doesn\'t propagate ViewTreeLifecycleOwner!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onCheckIsTextEditor()Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->K0:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lh0/o;->c(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/V;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->I0:LS0/Z;

    invoke-virtual {v0}, LS0/Z;->r()Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/platform/V;->f()Z

    move-result v0

    return v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LY0/a;->a(Landroid/content/Context;)LY0/e;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->setDensity(LY0/e;)V

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->l0(Landroid/content/res/Configuration;)I

    move-result v0

    iget v1, p0, Landroidx/compose/ui/platform/r;->O0:I

    if-eq v0, v1, :cond_0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->l0(Landroid/content/res/Configuration;)I

    move-result v0

    iput v0, p0, Landroidx/compose/ui/platform/r;->O0:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LR0/l;->a(Landroid/content/Context;)LR0/h$b;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->setFontFamilyResolver(LR0/h$b;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->h0:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->K0:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lh0/o;->c(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/V;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->I0:LS0/Z;

    invoke-virtual {v0, p1}, LS0/Z;->o(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/V;->e(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public onCreateVirtualViewTranslationRequests([J[ILjava/util/function/Consumer;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->U:Lj0/b;

    invoke-virtual {v0, p1, p2, p3}, Lj0/b;->s([J[ILjava/util/function/Consumer;)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getSnapshotObserver()LF0/q0;

    move-result-object v0

    invoke-virtual {v0}, LF0/q0;->l()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getViewTreeOwners()Landroidx/compose/ui/platform/r$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r$b;->a()Landroidx/lifecycle/r;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->U:Lj0/b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    invoke-virtual {v0, p0}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->a0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->i0:Li0/d;

    if-eqz v0, :cond_1

    sget-object v1, Li0/v;->a:Li0/v;

    invoke-virtual {v1, v0}, Li0/v;->b(Li0/d;)V

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->F0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->G0:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->H0:Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_2

    sget-object v0, Landroidx/compose/ui/platform/J;->a:Landroidx/compose/ui/platform/J;

    invoke-virtual {v0, p0}, Landroidx/compose/ui/platform/J;->a(Landroid/view/View;)V

    :cond_2
    return-void

    :cond_3
    const-string v0, "No lifecycle owner exists"

    invoke-static {v0}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method protected onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .prologue
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->onFocusChanged(ZILandroid/graphics/Rect;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lm0/i;

    move-result-object p1

    invoke-interface {p1}, Lm0/i;->m()V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .prologue
    iget-object p1, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->b1:Lx7/a;

    invoke-virtual {p1, v0}, LF0/V;->r(Lx7/a;)Z

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->p0:LY0/b;

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->S0()V

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->n0:Landroidx/compose/ui/platform/f0;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/f0;

    move-result-object p1

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 7

    .prologue
    const-string v0, "AndroidOwner:onMeasure"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->s0(LF0/J;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    :goto_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->f0(I)J

    move-result-wide v0

    const/16 p1, 0x20

    ushr-long v2, v0, p1

    invoke-static {v2, v3}, Li7/G;->g(J)J

    move-result-wide v2

    long-to-int v2, v2

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    invoke-static {v0, v1}, Li7/G;->g(J)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-direct {p0, p2}, Landroidx/compose/ui/platform/r;->f0(I)J

    move-result-wide v5

    ushr-long p1, v5, p1

    invoke-static {p1, p2}, Li7/G;->g(J)J

    move-result-wide p1

    long-to-int p1, p1

    and-long/2addr v3, v5

    invoke-static {v3, v4}, Li7/G;->g(J)J

    move-result-wide v3

    long-to-int p2, v3

    sget-object v1, LY0/b;->b:LY0/b$a;

    invoke-virtual {v1, v2, v0, p1, p2}, LY0/b$a;->a(IIII)J

    move-result-wide p1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->p0:LY0/b;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {p1, p2}, LY0/b;->a(J)LY0/b;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/r;->p0:LY0/b;

    iput-boolean v1, p0, Landroidx/compose/ui/platform/r;->q0:Z

    goto :goto_2

    :cond_1
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, LY0/b;->r()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, LY0/b;->f(JJ)Z

    move-result v1

    :goto_1
    if-nez v1, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/r;->q0:Z

    :cond_3
    :goto_2
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {v0, p1, p2}, LF0/V;->H(J)V

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {p1}, LF0/V;->t()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->t0()I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object p2

    invoke-virtual {p2}, LF0/J;->O()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->n0:Landroidx/compose/ui/platform/f0;

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/f0;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object p2

    invoke-virtual {p2}, LF0/J;->t0()I

    move-result p2

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->O()I

    move-result v1

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    :cond_4
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 0

    .prologue
    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->a0()Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->i0:Li0/d;

    if-eqz p2, :cond_0

    invoke-static {p2, p1}, Li0/f;->b(Li0/d;Landroid/view/ViewStructure;)V

    :cond_0
    return-void
.end method

.method public onRtlPropertiesChanged(I)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->D:Z

    if-eqz v0, :cond_1

    invoke-static {p1}, Landroidx/compose/ui/focus/f;->e(I)LY0/v;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, LY0/v;->C:LY0/v;

    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->setLayoutDirection(LY0/v;)V

    :cond_1
    return-void
.end method

.method public onScrollCaptureSearch(Landroid/graphics/Rect;Landroid/graphics/Point;Ljava/util/function/Consumer;)V
    .locals 1

    .prologue
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1f

    if-lt p1, p2, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->e1:LJ0/l;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LK0/q;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getCoroutineContext()Lm7/i;

    move-result-object v0

    invoke-virtual {p1, p0, p2, v0, p3}, LJ0/l;->d(Landroid/view/View;LK0/q;Lm7/i;Ljava/util/function/Consumer;)V

    :cond_0
    return-void
.end method

.method public onVirtualViewTranslationResponses(Landroid/util/LongSparseArray;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->U:Lj0/b;

    invoke-virtual {v0, v0, p1}, Lj0/b;->x(Lj0/b;Landroid/util/LongSparseArray;)V

    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->M:Landroidx/compose/ui/platform/K1;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/K1;->c(Z)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/r;->d1:Z

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    sget-object p1, Landroidx/compose/ui/platform/r;->g1:Landroidx/compose/ui/platform/r$a;

    invoke-static {p1}, Landroidx/compose/ui/platform/r$a;->a(Landroidx/compose/ui/platform/r$a;)Z

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getShowLayoutBounds()Z

    move-result v0

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/r;->setShowLayoutBounds(Z)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->q0()V

    :cond_0
    return-void
.end method

.method public p(LF0/J;Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {v0, p1, p2}, LF0/V;->i(LF0/J;Z)V

    return-void
.end method

.method public q(LF0/J;ZZZ)V
    .locals 0

    .prologue
    if-eqz p2, :cond_0

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {p2, p1, p3}, LF0/V;->C(LF0/J;Z)Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p4, :cond_1

    :goto_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->J0(LF0/J;)V

    goto :goto_1

    :cond_0
    iget-object p2, p0, Landroidx/compose/ui/platform/r;->r0:LF0/V;

    invoke-virtual {p2, p1, p3}, LF0/V;->F(LF0/J;Z)Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public q0()V
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->r0(LF0/J;)V

    return-void
.end method

.method public r()V
    .locals 6

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->j0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getSnapshotObserver()LF0/q0;

    move-result-object v0

    invoke-virtual {v0}, LF0/q0;->b()V

    iput-boolean v1, p0, Landroidx/compose/ui/platform/r;->j0:Z

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->n0:Landroidx/compose/ui/platform/f0;

    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->e0(Landroid/view/ViewGroup;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->X0:LX/b;

    invoke-virtual {v0}, LX/b;->x()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->X0:LX/b;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v0

    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_3

    iget-object v3, p0, Landroidx/compose/ui/platform/r;->X0:LX/b;

    invoke-virtual {v3}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, v2

    check-cast v3, Lx7/a;

    iget-object v4, p0, Landroidx/compose/ui/platform/r;->X0:LX/b;

    const/4 v5, 0x0

    invoke-virtual {v4, v2, v5}, LX/b;->J(ILjava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lx7/a;->b()Ljava/lang/Object;

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    iget-object v2, p0, Landroidx/compose/ui/platform/r;->X0:LX/b;

    invoke-virtual {v2, v1, v0}, LX/b;->E(II)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method public requestFocus(ILandroid/graphics/Rect;)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lm0/i;

    move-result-object v0

    invoke-interface {v0}, Lm0/i;->f()Lm0/n;

    move-result-object v0

    invoke-interface {v0}, Lm0/n;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1

    :cond_1
    invoke-static {p1}, Landroidx/compose/ui/focus/f;->d(I)Landroidx/compose/ui/focus/d;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d;->o()I

    move-result p1

    goto :goto_0

    :cond_2
    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->b()I

    move-result p1

    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lm0/i;

    move-result-object v0

    if-eqz p2, :cond_3

    invoke-static {p2}, Lo0/X1;->e(Landroid/graphics/Rect;)Ln0/i;

    move-result-object p2

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    new-instance v1, Landroidx/compose/ui/platform/r$s;

    invoke-direct {v1, p1}, Landroidx/compose/ui/platform/r$s;-><init>(I)V

    invoke-interface {v0, p1, p2, v1}, Lm0/i;->o(ILn0/i;Lx7/l;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    return p1
.end method

.method public s(J)J
    .locals 3

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->D0()V

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v0

    iget-wide v1, p0, Landroidx/compose/ui/platform/r;->A0:J

    invoke-static {v1, v2}, Ln0/g;->m(J)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    iget-wide v1, p0, Landroidx/compose/ui/platform/r;->A0:J

    invoke-static {v1, v2}, Ln0/g;->n(J)F

    move-result p2

    sub-float/2addr p1, p2

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->x0:[F

    invoke-static {v0, p1}, Ln0/h;->a(FF)J

    move-result-wide v0

    invoke-static {p2, v0, v1}, Lo0/J1;->f([FJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public setAccessibilityEventBatchIntervalMillis(J)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->T:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/x;->S0(J)V

    return-void
.end method

.method public final setConfigurationChangeObserver(Lx7/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->h0:Lx7/l;

    return-void
.end method

.method public final setContentCaptureManager$ui_release(Lj0/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->U:Lj0/b;

    return-void
.end method

.method public setCoroutineContext(Lm7/i;)V
    .locals 12

    .prologue
    iput-object p1, p0, Landroidx/compose/ui/platform/r;->K:Lm7/i;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->k0()LF0/b0;

    move-result-object p1

    invoke-virtual {p1}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object p1

    instance-of v0, p1, Lz0/W;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lz0/W;

    invoke-interface {v0}, Lz0/W;->o1()V

    :cond_0
    const/16 v0, 0x10

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v1

    invoke-interface {p1}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "visitSubtree called on an unattached node"

    invoke-static {v2}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    invoke-interface {p1}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v2

    invoke-static {p1}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p1

    new-instance v3, LF0/a0;

    invoke-direct {v3}, LF0/a0;-><init>()V

    :goto_0
    if-eqz p1, :cond_d

    if-nez v2, :cond_2

    invoke-virtual {p1}, LF0/J;->k0()LF0/b0;

    move-result-object v2

    invoke-virtual {v2}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v2

    :cond_2
    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->q1()I

    move-result v4

    and-int/2addr v4, v1

    const/4 v5, 0x0

    if-eqz v4, :cond_b

    :goto_1
    if-eqz v2, :cond_b

    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->v1()I

    move-result v4

    and-int/2addr v4, v1

    if-eqz v4, :cond_a

    move-object v4, v2

    move-object v6, v5

    :goto_2
    if-eqz v4, :cond_a

    instance-of v7, v4, LF0/v0;

    if-eqz v7, :cond_3

    check-cast v4, LF0/v0;

    instance-of v7, v4, Lz0/W;

    if-eqz v7, :cond_9

    check-cast v4, Lz0/W;

    invoke-interface {v4}, Lz0/W;->o1()V

    goto :goto_5

    :cond_3
    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->v1()I

    move-result v7

    and-int/2addr v7, v1

    if-eqz v7, :cond_9

    instance-of v7, v4, LF0/m;

    if-eqz v7, :cond_9

    move-object v7, v4

    check-cast v7, LF0/m;

    invoke-virtual {v7}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v7

    const/4 v8, 0x0

    move v9, v8

    :goto_3
    const/4 v10, 0x1

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->v1()I

    move-result v11

    and-int/2addr v11, v1

    if-eqz v11, :cond_7

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v10, :cond_4

    move-object v4, v7

    goto :goto_4

    :cond_4
    if-nez v6, :cond_5

    new-instance v6, LX/b;

    new-array v10, v0, [Landroidx/compose/ui/d$c;

    invoke-direct {v6, v10, v8}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_5
    if-eqz v4, :cond_6

    invoke-virtual {v6, v4}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v4, v5

    :cond_6
    invoke-virtual {v6, v7}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_7
    :goto_4
    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v7

    goto :goto_3

    :cond_8
    if-ne v9, v10, :cond_9

    goto :goto_2

    :cond_9
    :goto_5
    invoke-static {v6}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v4

    goto :goto_2

    :cond_a
    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v2

    goto :goto_1

    :cond_b
    invoke-virtual {p1}, LF0/J;->w0()LX/b;

    move-result-object p1

    invoke-virtual {v3, p1}, LF0/a0;->c(LX/b;)V

    invoke-virtual {v3}, LF0/a0;->a()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {v3}, LF0/a0;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF0/J;

    goto :goto_6

    :cond_c
    move-object p1, v5

    :goto_6
    move-object v2, v5

    goto/16 :goto_0

    :cond_d
    return-void
.end method

.method public final setLastMatrixRecalculationAnimationTime$ui_release(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/r;->y0:J

    return-void
.end method

.method public final setOnViewTreeOwnersAvailable(Lx7/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getViewTreeOwners()Landroidx/compose/ui/platform/r$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->E0:Lx7/l;

    :cond_1
    return-void
.end method

.method public setShowLayoutBounds(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/r;->m0:Z

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public t()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->T:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x;->u0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->U:Lj0/b;

    invoke-virtual {v0}, Lj0/b;->v()V

    return-void
.end method

.method public u(Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p2, Landroidx/compose/ui/platform/r$x;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/compose/ui/platform/r$x;

    iget v1, v0, Landroidx/compose/ui/platform/r$x;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/ui/platform/r$x;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/ui/platform/r$x;

    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/platform/r$x;-><init>(Landroidx/compose/ui/platform/r;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Landroidx/compose/ui/platform/r$x;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/ui/platform/r$x;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->K0:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Landroidx/compose/ui/platform/r$y;

    invoke-direct {v2, p0}, Landroidx/compose/ui/platform/r$y;-><init>(Landroidx/compose/ui/platform/r;)V

    iput v3, v0, Landroidx/compose/ui/platform/r$x;->H:I

    invoke-static {p2, v2, p1, v0}, Lh0/o;->d(Ljava/util/concurrent/atomic/AtomicReference;Lx7/l;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public v(Lx7/p;Lx7/a;Lr0/c;)LF0/m0;
    .locals 7

    .prologue
    if-eqz p3, :cond_0

    new-instance v6, Landroidx/compose/ui/platform/z0;

    const/4 v2, 0x0

    move-object v0, v6

    move-object v1, p3

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/z0;-><init>(Lr0/c;Lo0/C1;Landroidx/compose/ui/platform/r;Lx7/p;Lx7/a;)V

    return-object v6

    :cond_0
    iget-object p3, p0, Landroidx/compose/ui/platform/r;->W0:Landroidx/compose/ui/platform/I1;

    invoke-virtual {p3}, Landroidx/compose/ui/platform/I1;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LF0/m0;

    if-eqz p3, :cond_1

    invoke-interface {p3, p1, p2}, LF0/m0;->c(Lx7/p;Lx7/a;)V

    return-object p3

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isHardwareAccelerated()Z

    move-result p3

    if-eqz p3, :cond_2

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-eq p3, v0, :cond_2

    new-instance p3, Landroidx/compose/ui/platform/z0;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getGraphicsContext()Lo0/C1;

    move-result-object v0

    invoke-interface {v0}, Lo0/C1;->b()Lr0/c;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getGraphicsContext()Lo0/C1;

    move-result-object v3

    move-object v1, p3

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/platform/z0;-><init>(Lr0/c;Lo0/C1;Landroidx/compose/ui/platform/r;Lx7/p;Lx7/a;)V

    return-object p3

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->isHardwareAccelerated()Z

    move-result p3

    if-eqz p3, :cond_3

    iget-boolean p3, p0, Landroidx/compose/ui/platform/r;->B0:Z

    if-eqz p3, :cond_3

    :try_start_0
    new-instance p3, Landroidx/compose/ui/platform/j1;

    invoke-direct {p3, p0, p1, p2}, Landroidx/compose/ui/platform/j1;-><init>(Landroidx/compose/ui/platform/r;Lx7/p;Lx7/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p3

    :catchall_0
    const/4 p3, 0x0

    iput-boolean p3, p0, Landroidx/compose/ui/platform/r;->B0:Z

    :cond_3
    iget-object p3, p0, Landroidx/compose/ui/platform/r;->o0:Landroidx/compose/ui/platform/w0;

    if-nez p3, :cond_6

    sget-object p3, Landroidx/compose/ui/platform/B1;->R:Landroidx/compose/ui/platform/B1$c;

    invoke-virtual {p3}, Landroidx/compose/ui/platform/B1$c;->a()Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, v0}, Landroidx/compose/ui/platform/B1$c;->d(Landroid/view/View;)V

    :cond_4
    invoke-virtual {p3}, Landroidx/compose/ui/platform/B1$c;->b()Z

    move-result p3

    if-eqz p3, :cond_5

    new-instance p3, Landroidx/compose/ui/platform/w0;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/compose/ui/platform/w0;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_5
    new-instance p3, Landroidx/compose/ui/platform/C1;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/compose/ui/platform/C1;-><init>(Landroid/content/Context;)V

    :goto_0
    iput-object p3, p0, Landroidx/compose/ui/platform/r;->o0:Landroidx/compose/ui/platform/w0;

    invoke-virtual {p0, p3}, Landroidx/compose/ui/platform/r;->addView(Landroid/view/View;)V

    :cond_6
    new-instance p3, Landroidx/compose/ui/platform/B1;

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->o0:Landroidx/compose/ui/platform/w0;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p3, p0, v0, p1, p2}, Landroidx/compose/ui/platform/B1;-><init>(Landroidx/compose/ui/platform/r;Landroidx/compose/ui/platform/w0;Lx7/p;Lx7/a;)V

    return-object p3
.end method

.method public w(LF0/J;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->T:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/x;->t0(LF0/J;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->U:Lj0/b;

    invoke-virtual {v0, p1}, Lj0/b;->u(LF0/J;)V

    return-void
.end method

.method public x(Lx7/a;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->X0:LX/b;

    invoke-virtual {v0, p1}, LX/b;->l(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->X0:LX/b;

    invoke-virtual {v0, p1}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final x0(LF0/m0;Z)V
    .locals 0

    .prologue
    if-nez p2, :cond_0

    iget-boolean p2, p0, Landroidx/compose/ui/platform/r;->d0:Z

    if-nez p2, :cond_3

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->b0:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->c0:Ljava/util/List;

    if-eqz p2, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    iget-boolean p2, p0, Landroidx/compose/ui/platform/r;->d0:Z

    if-nez p2, :cond_2

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->b0:Ljava/util/List;

    :cond_1
    :goto_0
    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-object p2, p0, Landroidx/compose/ui/platform/r;->c0:Ljava/util/List;

    if-nez p2, :cond_1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/r;->c0:Ljava/util/List;

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public synthetic y(Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/d;->f(Landroidx/lifecycle/e;Landroidx/lifecycle/r;)V

    return-void
.end method
