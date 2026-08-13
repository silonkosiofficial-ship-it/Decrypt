.class public final Li9/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Li9/j$b;

.field private static final b:Li9/n;

.field private static final c:Li9/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li9/j$b;

    invoke-direct {v0}, Li9/j$b;-><init>()V

    sput-object v0, Li9/j$b;->a:Li9/j$b;

    sget-object v0, Li9/j;->k:Li9/j$a;

    sget-object v1, Li9/j$b$a;->D:Li9/j$b$a;

    invoke-virtual {v0, v1}, Li9/j$a;->a(Lx7/l;)Li9/n;

    move-result-object v1

    sput-object v1, Li9/j$b;->b:Li9/n;

    sget-object v1, Li9/j$b$b;->D:Li9/j$b$b;

    invoke-virtual {v0, v1}, Li9/j$a;->a(Lx7/l;)Li9/n;

    move-result-object v0

    sput-object v0, Li9/j$b;->c:Li9/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Li9/n;
    .locals 1

    sget-object v0, Li9/j$b;->b:Li9/n;

    return-object v0
.end method
