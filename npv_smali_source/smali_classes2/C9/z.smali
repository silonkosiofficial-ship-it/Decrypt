.class public final LC9/z;
.super Landroidx/lifecycle/T;
.source "SourceFile"


# instance fields
.field private final b:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/T;-><init>()V

    new-instance v0, LC9/y;

    invoke-direct {v0}, LC9/y;-><init>()V

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    iput-object v0, p0, LC9/z;->b:Li7/n;

    return-void
.end method

.method public static synthetic h()LC9/v;
    .locals 1

    invoke-static {}, LC9/z;->j()LC9/v;

    move-result-object v0

    return-object v0
.end method

.method private static final j()LC9/v;
    .locals 1

    new-instance v0, LC9/v;

    invoke-direct {v0}, LC9/v;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final i()LC9/v;
    .locals 1

    iget-object v0, p0, LC9/z;->b:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC9/v;

    return-object v0
.end method
