.class abstract Li3/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Li3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li3/d;

    invoke-direct {v0}, Li3/d;-><init>()V

    sput-object v0, Li3/d$a;->a:Li3/d;

    return-void
.end method

.method static synthetic a()Li3/d;
    .locals 1

    sget-object v0, Li3/d$a;->a:Li3/d;

    return-object v0
.end method
