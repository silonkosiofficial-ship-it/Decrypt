.class public final LL7/e;
.super LL7/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL7/e$b;
    }
.end annotation


# static fields
.field public static final h:LL7/e$b;

.field private static final i:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LL7/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LL7/e$b;-><init>(Ly7/k;)V

    sput-object v0, LL7/e;->h:LL7/e$b;

    sget-object v0, LL7/e$a;->D:LL7/e$a;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, LL7/e;->i:Li7/n;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .prologue
    new-instance v0, LE8/f;

    const-string v1, "DefaultBuiltIns"

    invoke-direct {v0, v1}, LE8/f;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, LL7/g;-><init>(LE8/n;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LL7/g;->f(Z)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(ZILy7/k;)V
    .locals 0

    .prologue
    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-direct {p0, p1}, LL7/e;-><init>(Z)V

    return-void
.end method

.method public static final synthetic F0()Li7/n;
    .locals 1

    sget-object v0, LL7/e;->i:Li7/n;

    return-object v0
.end method
