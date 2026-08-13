.class final LS5/x$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS5/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# static fields
.field public static final a:LS5/x$d;

.field private static final b:LQ1/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS5/x$d;

    invoke-direct {v0}, LS5/x$d;-><init>()V

    sput-object v0, LS5/x$d;->a:LS5/x$d;

    const-string v0, "session_id"

    invoke-static {v0}, LQ1/h;->g(Ljava/lang/String;)LQ1/f$a;

    move-result-object v0

    sput-object v0, LS5/x$d;->b:LQ1/f$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LQ1/f$a;
    .locals 1

    sget-object v0, LS5/x$d;->b:LQ1/f$a;

    return-object v0
.end method
