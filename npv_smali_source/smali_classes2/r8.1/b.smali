.class final Lr8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/q;


# static fields
.field public static final a:Lr8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr8/b;

    invoke-direct {v0}, Lr8/b;-><init>()V

    sput-object v0, Lr8/b;->a:Lr8/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LO7/G;)LO7/e;
    .locals 1

    const-string v0, "moduleDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln8/i;->a:Ln8/i;

    invoke-virtual {v0}, Ln8/i;->i()Ln8/b;

    move-result-object v0

    invoke-static {p1, v0}, LO7/x;->a(LO7/G;Ln8/b;)LO7/e;

    move-result-object p1

    return-object p1
.end method
