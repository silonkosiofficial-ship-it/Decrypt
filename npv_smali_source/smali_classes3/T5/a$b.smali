.class final LT5/a$b;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT5/a;->c(Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field synthetic L:Ljava/lang/Object;

.field final synthetic M:LT5/a;

.field N:I


# direct methods
.method constructor <init>(LT5/a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LT5/a$b;->M:LT5/a;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LT5/a$b;->L:Ljava/lang/Object;

    iget p1, p0, LT5/a$b;->N:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LT5/a$b;->N:I

    iget-object p1, p0, LT5/a$b;->M:LT5/a;

    invoke-virtual {p1, p0}, LT5/a;->c(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
