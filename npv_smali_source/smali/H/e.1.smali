.class public final LH/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LH/e;

.field public static b:Lx7/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LH/e;

    invoke-direct {v0}, LH/e;-><init>()V

    sput-object v0, LH/e;->a:LH/e;

    const/4 v0, 0x0

    sget-object v1, LH/e$a;->D:LH/e$a;

    const v2, 0x2803267d

    invoke-static {v2, v0, v1}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v0

    sput-object v0, LH/e;->b:Lx7/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lx7/q;
    .locals 1

    sget-object v0, LH/e;->b:Lx7/q;

    return-object v0
.end method
