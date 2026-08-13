.class public abstract Landroidx/compose/foundation/lazy/layout/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/layout/b$a;
    }
.end annotation


# static fields
.field public static final a:Landroidx/compose/foundation/lazy/layout/b$a;

.field public static final b:I

.field private static final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/lazy/layout/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/layout/b$a;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/foundation/lazy/layout/b;->a:Landroidx/compose/foundation/lazy/layout/b$a;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/lazy/layout/b;->b:I

    const v0, 0x7fffffff

    invoke-static {v0, v0}, LY0/q;->a(II)J

    move-result-wide v0

    sput-wide v0, Landroidx/compose/foundation/lazy/layout/b;->c:J

    return-void
.end method

.method public static final synthetic a()J
    .locals 2

    sget-wide v0, Landroidx/compose/foundation/lazy/layout/b;->c:J

    return-wide v0
.end method


# virtual methods
.method public abstract b(JZ)V
.end method

.method public abstract c()V
.end method

.method public abstract d()J
.end method

.method public abstract e()Lr0/c;
.end method

.method public abstract f()J
.end method

.method public abstract g()J
.end method

.method public abstract h()J
.end method

.method public abstract i()Z
.end method

.method public abstract j()V
.end method

.method public abstract k(J)V
.end method

.method public abstract l(J)V
.end method

.method public abstract m(J)V
.end method
