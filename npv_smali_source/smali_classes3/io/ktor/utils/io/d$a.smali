.class public final Lio/ktor/utils/io/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/ktor/utils/io/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lio/ktor/utils/io/d$a;

.field private static final b:Lio/ktor/utils/io/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/ktor/utils/io/d$a;

    invoke-direct {v0}, Lio/ktor/utils/io/d$a;-><init>()V

    sput-object v0, Lio/ktor/utils/io/d$a;->a:Lio/ktor/utils/io/d$a;

    new-instance v0, Lio/ktor/utils/io/d$a$a;

    invoke-direct {v0}, Lio/ktor/utils/io/d$a$a;-><init>()V

    sput-object v0, Lio/ktor/utils/io/d$a;->b:Lio/ktor/utils/io/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lio/ktor/utils/io/d;
    .locals 1

    sget-object v0, Lio/ktor/utils/io/d$a;->b:Lio/ktor/utils/io/d;

    return-object v0
.end method
