.class public Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# instance fields
.field private final a:Le5/F;

.field private final b:Le5/F;

.field private final c:Le5/F;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LT5/b$a;->C:LT5/b$a;

    invoke-static {v0}, LT5/a;->a(LT5/b$a;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, LU4/a;

    const-class v1, Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, v1}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:Le5/F;

    const-class v0, LU4/b;

    invoke-static {v0, v1}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:Le5/F;

    const-class v0, LU4/c;

    invoke-static {v0, v1}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:Le5/F;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;Le5/e;)Lcom/google/firebase/crashlytics/a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b(Le5/e;)Lcom/google/firebase/crashlytics/a;

    move-result-object p0

    return-object p0
.end method

.method private b(Le5/e;)Lcom/google/firebase/crashlytics/a;
    .locals 11

    .prologue
    const/4 v0, 0x0

    invoke-static {v0}, Ll5/f;->f(Z)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-class v2, LQ4/f;

    invoke-interface {p1, v2}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LQ4/f;

    const-class v2, LG5/e;

    invoke-interface {p1, v2}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, LG5/e;

    const-class v2, Lh5/a;

    invoke-interface {p1, v2}, Le5/e;->i(Ljava/lang/Class;)LF5/a;

    move-result-object v5

    const-class v2, LT4/a;

    invoke-interface {p1, v2}, Le5/e;->i(Ljava/lang/Class;)LF5/a;

    move-result-object v6

    const-class v2, LP5/a;

    invoke-interface {p1, v2}, Le5/e;->i(Ljava/lang/Class;)LF5/a;

    move-result-object v7

    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:Le5/F;

    invoke-interface {p1, v2}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/util/concurrent/ExecutorService;

    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:Le5/F;

    invoke-interface {p1, v2}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/util/concurrent/ExecutorService;

    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:Le5/F;

    invoke-interface {p1, v2}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Ljava/util/concurrent/ExecutorService;

    invoke-static/range {v3 .. v10}, Lcom/google/firebase/crashlytics/a;->b(LQ4/f;LG5/e;LF5/a;LF5/a;LF5/a;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)Lcom/google/firebase/crashlytics/a;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x10

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Initializing Crashlytics blocked main for "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " ms"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4

    const-class v0, Lcom/google/firebase/crashlytics/a;

    invoke-static {v0}, Le5/c;->e(Ljava/lang/Class;)Le5/c$b;

    move-result-object v0

    const-string v1, "fire-cls"

    invoke-virtual {v0, v1}, Le5/c$b;->h(Ljava/lang/String;)Le5/c$b;

    move-result-object v0

    const-class v2, LQ4/f;

    invoke-static {v2}, Le5/r;->j(Ljava/lang/Class;)Le5/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    const-class v2, LG5/e;

    invoke-static {v2}, Le5/r;->j(Ljava/lang/Class;)Le5/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:Le5/F;

    invoke-static {v2}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:Le5/F;

    invoke-static {v2}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:Le5/F;

    invoke-static {v2}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    const-class v2, Lh5/a;

    invoke-static {v2}, Le5/r;->a(Ljava/lang/Class;)Le5/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    const-class v2, LT4/a;

    invoke-static {v2}, Le5/r;->a(Ljava/lang/Class;)Le5/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    const-class v2, LP5/a;

    invoke-static {v2}, Le5/r;->a(Ljava/lang/Class;)Le5/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    new-instance v2, Lg5/f;

    invoke-direct {v2, p0}, Lg5/f;-><init>(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;)V

    invoke-virtual {v0, v2}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Le5/c$b;->e()Le5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Le5/c$b;->d()Le5/c;

    move-result-object v0

    const-string v2, "19.3.0"

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
