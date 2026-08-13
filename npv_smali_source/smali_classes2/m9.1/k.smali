.class public abstract Lm9/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/k$a;
    }
.end annotation


# static fields
.field public static final a:Lm9/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm9/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm9/k$a;-><init>(Ly7/k;)V

    sput-object v0, Lm9/k;->a:Lm9/k$a;

    return-void
.end method

.method public static final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lm9/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method
