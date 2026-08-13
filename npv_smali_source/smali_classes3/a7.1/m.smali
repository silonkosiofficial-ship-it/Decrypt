.class public final La7/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La7/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La7/m;

    invoke-direct {v0}, La7/m;-><init>()V

    sput-object v0, La7/m;->a:La7/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
