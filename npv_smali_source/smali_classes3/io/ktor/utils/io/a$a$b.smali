.class public final Lio/ktor/utils/io/a$a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/ktor/utils/io/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final synthetic a:Lio/ktor/utils/io/a$a$b;

.field private static final b:Lio/ktor/utils/io/a$a$a;

.field private static final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/ktor/utils/io/a$a$b;

    invoke-direct {v0}, Lio/ktor/utils/io/a$a$b;-><init>()V

    sput-object v0, Lio/ktor/utils/io/a$a$b;->a:Lio/ktor/utils/io/a$a$b;

    new-instance v0, Lio/ktor/utils/io/a$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/ktor/utils/io/a$a$a;-><init>(Ljava/lang/Throwable;)V

    sput-object v0, Lio/ktor/utils/io/a$a$b;->b:Lio/ktor/utils/io/a$a$a;

    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lio/ktor/utils/io/a$a$b;->c:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lio/ktor/utils/io/a$a$a;
    .locals 1

    sget-object v0, Lio/ktor/utils/io/a$a$b;->b:Lio/ktor/utils/io/a$a$a;

    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lio/ktor/utils/io/a$a$b;->c:Ljava/lang/Object;

    return-object v0
.end method
