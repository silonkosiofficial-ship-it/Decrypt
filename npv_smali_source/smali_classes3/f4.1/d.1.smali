.class abstract Lf4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lf4/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf4/e;

    invoke-direct {v0}, Lf4/e;-><init>()V

    sput-object v0, Lf4/d;->a:Lf4/e;

    return-void
.end method

.method static bridge synthetic a()Lf4/e;
    .locals 1

    sget-object v0, Lf4/d;->a:Lf4/e;

    return-object v0
.end method
