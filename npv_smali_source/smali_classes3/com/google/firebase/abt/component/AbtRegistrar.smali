.class public Lcom/google/firebase/abt/component/AbtRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "fire-abt"

    sput-object v0, Lcom/google/firebase/abt/component/AbtRegistrar;->LIBRARY_NAME:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Le5/e;)Lcom/google/firebase/abt/component/a;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/abt/component/AbtRegistrar;->lambda$getComponents$0(Le5/e;)Lcom/google/firebase/abt/component/a;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Le5/e;)Lcom/google/firebase/abt/component/a;
    .locals 3

    new-instance v0, Lcom/google/firebase/abt/component/a;

    const-class v1, Landroid/content/Context;

    invoke-interface {p0, v1}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, LT4/a;

    invoke-interface {p0, v2}, Le5/e;->d(Ljava/lang/Class;)LF5/b;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/google/firebase/abt/component/a;-><init>(Landroid/content/Context;LF5/b;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le5/c;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/google/firebase/abt/component/a;

    invoke-static {v0}, Le5/c;->e(Ljava/lang/Class;)Le5/c$b;

    move-result-object v0

    const-string v1, "fire-abt"

    invoke-virtual {v0, v1}, Le5/c$b;->h(Ljava/lang/String;)Le5/c$b;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    invoke-static {v2}, Le5/r;->j(Ljava/lang/Class;)Le5/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    const-class v2, LT4/a;

    invoke-static {v2}, Le5/r;->h(Ljava/lang/Class;)Le5/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    new-instance v2, LS4/a;

    invoke-direct {v2}, LS4/a;-><init>()V

    invoke-virtual {v0, v2}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Le5/c$b;->d()Le5/c;

    move-result-object v0

    const-string v2, "21.1.1"

    invoke-static {v1, v2}, LM5/h;->b(Ljava/lang/String;Ljava/lang/String;)Le5/c;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Le5/c;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
