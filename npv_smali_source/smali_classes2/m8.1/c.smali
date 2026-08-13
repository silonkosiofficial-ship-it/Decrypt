.class public final Lm8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm8/c;

.field private static final b:Lk8/b$b;

.field private static final c:Lk8/b$b;

.field private static final d:Lk8/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/c;

    invoke-direct {v0}, Lm8/c;-><init>()V

    sput-object v0, Lm8/c;->a:Lm8/c;

    invoke-static {}, Lk8/b$d;->c()Lk8/b$b;

    move-result-object v0

    sput-object v0, Lm8/c;->b:Lk8/b$b;

    invoke-static {}, Lk8/b$d;->c()Lk8/b$b;

    move-result-object v0

    sput-object v0, Lm8/c;->c:Lk8/b$b;

    invoke-static {v0}, Lk8/b$d;->b(Lk8/b$d;)Lk8/b$b;

    move-result-object v0

    sput-object v0, Lm8/c;->d:Lk8/b$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lk8/b$b;
    .locals 1

    sget-object v0, Lm8/c;->b:Lk8/b$b;

    return-object v0
.end method
