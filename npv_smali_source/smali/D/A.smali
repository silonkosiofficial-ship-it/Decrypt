.class public final LD/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/G1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD/A$a;
    }
.end annotation


# static fields
.field private static final G:LD/A$a;


# instance fields
.field private final C:I

.field private final D:I

.field private final E:LV/w0;

.field private F:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LD/A$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LD/A$a;-><init>(Ly7/k;)V

    sput-object v0, LD/A;->G:LD/A$a;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, LD/A;->C:I

    iput p3, p0, LD/A;->D:I

    sget-object v0, LD/A;->G:LD/A$a;

    invoke-static {v0, p1, p2, p3}, LD/A$a;->a(LD/A$a;III)LE7/i;

    move-result-object p2

    invoke-static {}, LV/v1;->p()LV/u1;

    move-result-object p3

    invoke-static {p2, p3}, LV/v1;->h(Ljava/lang/Object;LV/u1;)LV/w0;

    move-result-object p2

    iput-object p2, p0, LD/A;->E:LV/w0;

    iput p1, p0, LD/A;->F:I

    return-void
.end method

.method private g(LE7/i;)V
    .locals 1

    iget-object v0, p0, LD/A;->E:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public e()LE7/i;
    .locals 1

    iget-object v0, p0, LD/A;->E:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE7/i;

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD/A;->e()LE7/i;

    move-result-object v0

    return-object v0
.end method

.method public final n(I)V
    .locals 3

    .prologue
    iget v0, p0, LD/A;->F:I

    if-eq p1, v0, :cond_0

    iput p1, p0, LD/A;->F:I

    sget-object v0, LD/A;->G:LD/A$a;

    iget v1, p0, LD/A;->C:I

    iget v2, p0, LD/A;->D:I

    invoke-static {v0, p1, v1, v2}, LD/A$a;->a(LD/A$a;III)LE7/i;

    move-result-object p1

    invoke-direct {p0, p1}, LD/A;->g(LE7/i;)V

    :cond_0
    return-void
.end method
