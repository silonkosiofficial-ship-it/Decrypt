.class public abstract LE7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lz7/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE7/a$a;
    }
.end annotation


# static fields
.field public static final F:LE7/a$a;


# instance fields
.field private final C:C

.field private final D:C

.field private final E:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LE7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE7/a$a;-><init>(Ly7/k;)V

    sput-object v0, LE7/a;->F:LE7/a$a;

    return-void
.end method

.method public constructor <init>(CCI)V
    .locals 1

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_1

    const/high16 v0, -0x80000000

    if-eq p3, v0, :cond_0

    iput-char p1, p0, LE7/a;->C:C

    invoke-static {p1, p2, p3}, Lq7/c;->b(III)I

    move-result p1

    int-to-char p1, p1

    iput-char p1, p0, LE7/a;->D:C

    iput p3, p0, LE7/a;->E:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be non-zero."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final f()C
    .locals 1

    iget-char v0, p0, LE7/a;->C:C

    return v0
.end method

.method public final g()C
    .locals 1

    iget-char v0, p0, LE7/a;->D:C

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LE7/a;->o()Lj7/u;

    move-result-object v0

    return-object v0
.end method

.method public o()Lj7/u;
    .locals 4

    new-instance v0, LE7/b;

    iget-char v1, p0, LE7/a;->C:C

    iget-char v2, p0, LE7/a;->D:C

    iget v3, p0, LE7/a;->E:I

    invoke-direct {v0, v1, v2, v3}, LE7/b;-><init>(CCI)V

    return-object v0
.end method
