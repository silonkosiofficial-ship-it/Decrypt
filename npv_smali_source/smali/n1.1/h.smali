.class public abstract Ln1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/h$a;
    }
.end annotation


# static fields
.field public static final a:Ln1/h$a;

.field private static final b:Ln1/b$b;

.field private static c:I

.field private static d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln1/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln1/h$a;-><init>(Ly7/k;)V

    sput-object v0, Ln1/h;->a:Ln1/h$a;

    new-instance v0, Ln1/b$b;

    invoke-direct {v0}, Ln1/b$b;-><init>()V

    sput-object v0, Ln1/h;->b:Ln1/b$b;

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Ln1/h;->c:I

    return v0
.end method

.method public static final synthetic b()Ln1/b$b;
    .locals 1

    sget-object v0, Ln1/h;->b:Ln1/b$b;

    return-object v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, Ln1/h;->d:I

    return v0
.end method

.method public static final synthetic d(I)V
    .locals 0

    sput p0, Ln1/h;->c:I

    return-void
.end method

.method public static final synthetic e(I)V
    .locals 0

    sput p0, Ln1/h;->d:I

    return-void
.end method
