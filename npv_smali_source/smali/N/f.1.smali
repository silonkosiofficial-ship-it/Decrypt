.class final LN/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/f;

.field private static b:Lo0/E1;

.field private static c:Lo0/q0;

.field private static d:Lq0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/f;

    invoke-direct {v0}, LN/f;-><init>()V

    sput-object v0, LN/f;->a:LN/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lo0/q0;
    .locals 1

    sget-object v0, LN/f;->c:Lo0/q0;

    return-object v0
.end method

.method public final b()Lq0/a;
    .locals 1

    sget-object v0, LN/f;->d:Lq0/a;

    return-object v0
.end method

.method public final c()Lo0/E1;
    .locals 1

    sget-object v0, LN/f;->b:Lo0/E1;

    return-object v0
.end method

.method public final d(Lo0/q0;)V
    .locals 0

    sput-object p1, LN/f;->c:Lo0/q0;

    return-void
.end method

.method public final e(Lq0/a;)V
    .locals 0

    sput-object p1, LN/f;->d:Lq0/a;

    return-void
.end method

.method public final f(Lo0/E1;)V
    .locals 0

    sput-object p1, LN/f;->b:Lo0/E1;

    return-void
.end method
