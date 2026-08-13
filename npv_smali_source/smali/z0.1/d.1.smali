.class public final Lz0/d;
.super Ljava/util/concurrent/CancellationException;
.source "SourceFile"


# static fields
.field public static final C:Lz0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz0/d;

    invoke-direct {v0}, Lz0/d;-><init>()V

    sput-object v0, Lz0/d;->C:Lz0/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/CancellationException;-><init>()V

    return-void
.end method


# virtual methods
.method public fillInStackTrace()Ljava/lang/Throwable;
    .locals 1

    invoke-static {}, Lz0/V;->a()[Ljava/lang/StackTraceElement;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-object p0
.end method
