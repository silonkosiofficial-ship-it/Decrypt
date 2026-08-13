.class public final Lj1/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lj1/b$c;->a:F

    iput p2, p0, Lj1/b$c;->b:F

    iput p1, p0, Lj1/b$c;->c:F

    return-void
.end method


# virtual methods
.method public value()F
    .locals 2

    .prologue
    iget-boolean v0, p0, Lj1/b$c;->d:Z

    if-nez v0, :cond_0

    iget v0, p0, Lj1/b$c;->c:F

    iget v1, p0, Lj1/b$c;->b:F

    add-float/2addr v0, v1

    iput v0, p0, Lj1/b$c;->c:F

    :cond_0
    iget v0, p0, Lj1/b$c;->c:F

    return v0
.end method
