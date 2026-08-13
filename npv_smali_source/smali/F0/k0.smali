.class public final LF0/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/p0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/k0$b;
    }
.end annotation


# static fields
.field public static final D:LF0/k0$b;

.field public static final E:I

.field private static final F:Lx7/l;


# instance fields
.field private final C:LF0/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF0/k0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF0/k0$b;-><init>(Ly7/k;)V

    sput-object v0, LF0/k0;->D:LF0/k0$b;

    const/16 v0, 0x8

    sput v0, LF0/k0;->E:I

    sget-object v0, LF0/k0$a;->D:LF0/k0$a;

    sput-object v0, LF0/k0;->F:Lx7/l;

    return-void
.end method

.method public constructor <init>(LF0/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0/k0;->C:LF0/i0;

    return-void
.end method

.method public static final synthetic a()Lx7/l;
    .locals 1

    sget-object v0, LF0/k0;->F:Lx7/l;

    return-object v0
.end method


# virtual methods
.method public R()Z
    .locals 1

    iget-object v0, p0, LF0/k0;->C:LF0/i0;

    invoke-interface {v0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    return v0
.end method

.method public final b()LF0/i0;
    .locals 1

    iget-object v0, p0, LF0/k0;->C:LF0/i0;

    return-object v0
.end method
