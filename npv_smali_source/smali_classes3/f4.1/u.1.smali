.class abstract Lf4/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lf4/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf4/v;

    invoke-direct {v0}, Lf4/v;-><init>()V

    sput-object v0, Lf4/u;->a:Lf4/v;

    return-void
.end method

.method static bridge synthetic a()Lf4/v;
    .locals 1

    sget-object v0, Lf4/u;->a:Lf4/v;

    return-object v0
.end method
