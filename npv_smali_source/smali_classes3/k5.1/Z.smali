.class public Lk5/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lk5/y;

.field private final b:Lq5/e;

.field private final c:Lr5/b;

.field private final d:Lm5/e;

.field private final e:Lm5/n;

.field private final f:Lk5/H;

.field private final g:Ll5/f;


# direct methods
.method constructor <init>(Lk5/y;Lq5/e;Lr5/b;Lm5/e;Lm5/n;Lk5/H;Ll5/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/Z;->a:Lk5/y;

    iput-object p2, p0, Lk5/Z;->b:Lq5/e;

    iput-object p3, p0, Lk5/Z;->c:Lr5/b;

    iput-object p4, p0, Lk5/Z;->d:Lm5/e;

    iput-object p5, p0, Lk5/Z;->e:Lm5/n;

    iput-object p6, p0, Lk5/Z;->f:Lk5/H;

    iput-object p7, p0, Lk5/Z;->g:Ll5/f;

    return-void
.end method

.method public static synthetic a(Lk5/Z;Ln5/F$e$d;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lk5/Z;->q(Ln5/F$e$d;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic b(Lk5/Z;Ll4/l;)Z
    .locals 0

    invoke-direct {p0, p1}, Lk5/Z;->t(Ll4/l;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Ln5/F$c;Ln5/F$c;)I
    .locals 0

    invoke-static {p0, p1}, Lk5/Z;->p(Ln5/F$c;Ln5/F$c;)I

    move-result p0

    return p0
.end method

.method private d(Ln5/F$e$d;Lm5/e;Lm5/n;)Ln5/F$e$d;
    .locals 2

    .prologue
    invoke-virtual {p1}, Ln5/F$e$d;->h()Ln5/F$e$d$b;

    move-result-object v0

    invoke-virtual {p2}, Lm5/e;->c()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {}, Ln5/F$e$d$d;->a()Ln5/F$e$d$d$a;

    move-result-object v1

    invoke-virtual {v1, p2}, Ln5/F$e$d$d$a;->b(Ljava/lang/String;)Ln5/F$e$d$d$a;

    move-result-object p2

    invoke-virtual {p2}, Ln5/F$e$d$d$a;->a()Ln5/F$e$d$d;

    move-result-object p2

    invoke-virtual {v0, p2}, Ln5/F$e$d$b;->d(Ln5/F$e$d$d;)Ln5/F$e$d$b;

    goto :goto_0

    :cond_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p2

    const-string v1, "No log data to include with this event."

    invoke-virtual {p2, v1}, Lh5/g;->i(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p3}, Lm5/n;->f()Ljava/util/Map;

    move-result-object p2

    invoke-static {p2}, Lk5/Z;->n(Ljava/util/Map;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p3}, Lm5/n;->g()Ljava/util/Map;

    move-result-object p3

    invoke-static {p3}, Lk5/Z;->n(Ljava/util/Map;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    invoke-virtual {p1}, Ln5/F$e$d;->b()Ln5/F$e$d$a;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$e$d$a;->i()Ln5/F$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Ln5/F$e$d$a$a;->e(Ljava/util/List;)Ln5/F$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1, p3}, Ln5/F$e$d$a$a;->g(Ljava/util/List;)Ln5/F$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$e$d$a$a;->a()Ln5/F$e$d$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln5/F$e$d$b;->b(Ln5/F$e$d$a;)Ln5/F$e$d$b;

    :cond_2
    invoke-virtual {v0}, Ln5/F$e$d$b;->a()Ln5/F$e$d;

    move-result-object p1

    return-object p1
.end method

.method private e(Ln5/F$e$d;)Ln5/F$e$d;
    .locals 2

    iget-object v0, p0, Lk5/Z;->d:Lm5/e;

    iget-object v1, p0, Lk5/Z;->e:Lm5/n;

    invoke-direct {p0, p1, v0, v1}, Lk5/Z;->d(Ln5/F$e$d;Lm5/e;Lm5/n;)Ln5/F$e$d;

    move-result-object p1

    iget-object v0, p0, Lk5/Z;->e:Lm5/n;

    invoke-direct {p0, p1, v0}, Lk5/Z;->f(Ln5/F$e$d;Lm5/n;)Ln5/F$e$d;

    move-result-object p1

    return-object p1
.end method

.method private f(Ln5/F$e$d;Lm5/n;)Ln5/F$e$d;
    .locals 1

    .prologue
    invoke-virtual {p2}, Lm5/n;->h()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ln5/F$e$d;->h()Ln5/F$e$d$b;

    move-result-object p1

    invoke-static {}, Ln5/F$e$d$f;->a()Ln5/F$e$d$f$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Ln5/F$e$d$f$a;->b(Ljava/util/List;)Ln5/F$e$d$f$a;

    move-result-object p2

    invoke-virtual {p2}, Ln5/F$e$d$f$a;->a()Ln5/F$e$d$f;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln5/F$e$d$b;->e(Ln5/F$e$d$f;)Ln5/F$e$d$b;

    invoke-virtual {p1}, Ln5/F$e$d$b;->a()Ln5/F$e$d;

    move-result-object p1

    return-object p1
.end method

.method private static g(Landroid/app/ApplicationExitInfo;)Ln5/F$a;
    .locals 5

    .prologue
    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, Lk5/O;->a(Landroid/app/ApplicationExitInfo;)Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lk5/Z;->h(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not get input trace in application exit info: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lk5/P;->a(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " Error: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lh5/g;->k(Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-static {}, Ln5/F$a;->a()Ln5/F$a$b;

    move-result-object v1

    invoke-static {p0}, Lk5/Q;->a(Landroid/app/ApplicationExitInfo;)I

    move-result v2

    invoke-virtual {v1, v2}, Ln5/F$a$b;->c(I)Ln5/F$a$b;

    move-result-object v1

    invoke-static {p0}, Lk5/S;->a(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln5/F$a$b;->e(Ljava/lang/String;)Ln5/F$a$b;

    move-result-object v1

    invoke-static {p0}, LR2/e;->a(Landroid/app/ApplicationExitInfo;)I

    move-result v2

    invoke-virtual {v1, v2}, Ln5/F$a$b;->g(I)Ln5/F$a$b;

    move-result-object v1

    invoke-static {p0}, Lk5/N;->a(Landroid/app/ApplicationExitInfo;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ln5/F$a$b;->i(J)Ln5/F$a$b;

    move-result-object v1

    invoke-static {p0}, Lk5/T;->a(Landroid/app/ApplicationExitInfo;)I

    move-result v2

    invoke-virtual {v1, v2}, Ln5/F$a$b;->d(I)Ln5/F$a$b;

    move-result-object v1

    invoke-static {p0}, Lk5/U;->a(Landroid/app/ApplicationExitInfo;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ln5/F$a$b;->f(J)Ln5/F$a$b;

    move-result-object v1

    invoke-static {p0}, Lk5/V;->a(Landroid/app/ApplicationExitInfo;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ln5/F$a$b;->h(J)Ln5/F$a$b;

    move-result-object p0

    invoke-virtual {p0, v0}, Ln5/F$a$b;->j(Ljava/lang/String;)Ln5/F$a$b;

    move-result-object p0

    invoke-virtual {p0}, Ln5/F$a$b;->a()Ln5/F$a;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 4

    .prologue
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x2000

    new-array v1, v1, [B

    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static i(Landroid/content/Context;Lk5/H;Lq5/g;Lk5/a;Lm5/e;Lm5/n;Lt5/d;Ls5/j;Lk5/M;Lk5/m;Ll5/f;)Lk5/Z;
    .locals 9

    move-object/from16 v6, p7

    new-instance v7, Lk5/y;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v4, p6

    move-object/from16 v5, p7

    invoke-direct/range {v0 .. v5}, Lk5/y;-><init>(Landroid/content/Context;Lk5/H;Lk5/a;Lt5/d;Ls5/j;)V

    new-instance v2, Lq5/e;

    move-object v0, p2

    move-object/from16 v1, p9

    invoke-direct {v2, p2, v6, v1}, Lq5/e;-><init>(Lq5/g;Ls5/j;Lk5/m;)V

    move-object v0, p0

    move-object/from16 v1, p8

    invoke-static {p0, v6, v1}, Lr5/b;->b(Landroid/content/Context;Ls5/j;Lk5/M;)Lr5/b;

    move-result-object v3

    new-instance v8, Lk5/Z;

    move-object v0, v8

    move-object v1, v7

    move-object v4, p4

    move-object v5, p5

    move-object v6, p1

    move-object/from16 v7, p10

    invoke-direct/range {v0 .. v7}, Lk5/Z;-><init>(Lk5/y;Lq5/e;Lr5/b;Lm5/e;Lm5/n;Lk5/H;Ll5/f;)V

    return-object v8
.end method

.method private j(Lk5/z;)Lk5/z;
    .locals 3

    .prologue
    invoke-virtual {p1}, Lk5/z;->b()Ln5/F;

    move-result-object v0

    invoke-virtual {v0}, Ln5/F;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lk5/z;->b()Ln5/F;

    move-result-object v0

    invoke-virtual {v0}, Ln5/F;->g()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lk5/Z;->f:Lk5/H;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lk5/H;->d(Z)Lk5/G;

    move-result-object v0

    invoke-virtual {p1}, Lk5/z;->b()Ln5/F;

    move-result-object v1

    invoke-virtual {v0}, Lk5/G;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln5/F;->t(Ljava/lang/String;)Ln5/F;

    move-result-object v1

    invoke-virtual {v0}, Lk5/G;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ln5/F;->s(Ljava/lang/String;)Ln5/F;

    move-result-object v0

    invoke-virtual {p1}, Lk5/z;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lk5/z;->c()Ljava/io/File;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lk5/z;->a(Ln5/F;Ljava/lang/String;Ljava/io/File;)Lk5/z;

    move-result-object p1

    return-object p1
.end method

.method private m(Ljava/lang/String;Ljava/util/List;)Landroid/app/ApplicationExitInfo;
    .locals 5

    .prologue
    iget-object v0, p0, Lk5/Z;->b:Lq5/e;

    invoke-virtual {v0, p1}, Lq5/e;->q(Ljava/lang/String;)J

    move-result-wide v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    const/4 v2, 0x0

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LR2/d;->a(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    move-result-object p2

    invoke-static {p2}, Lk5/N;->a(Landroid/app/ApplicationExitInfo;)J

    move-result-wide v3

    cmp-long v3, v3, v0

    if-gez v3, :cond_0

    return-object v2

    :cond_0
    invoke-static {p2}, LR2/e;->a(Landroid/app/ApplicationExitInfo;)I

    move-result v2

    const/4 v3, 0x6

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    return-object p2

    :cond_2
    return-object v2
.end method

.method private static n(Ljava/util/Map;)Ljava/util/List;
    .locals 4

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-static {}, Ln5/F$c;->a()Ln5/F$c$a;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ln5/F$c$a;->b(Ljava/lang/String;)Ln5/F$c$a;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Ln5/F$c$a;->c(Ljava/lang/String;)Ln5/F$c$a;

    move-result-object v1

    invoke-virtual {v1}, Ln5/F$c$a;->a()Ln5/F$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lk5/W;

    invoke-direct {p0}, Lk5/W;-><init>()V

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic p(Ln5/F$c;Ln5/F$c;)I
    .locals 0

    invoke-virtual {p0}, Ln5/F$c;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ln5/F$c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private synthetic q(Ln5/F$e$d;Ljava/lang/String;Z)V
    .locals 2

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "disk worker: log non-fatal event to persistence"

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lk5/Z;->b:Lq5/e;

    invoke-virtual {v0, p1, p2, p3}, Lq5/e;->y(Ln5/F$e$d;Ljava/lang/String;Z)V

    return-void
.end method

.method private t(Ll4/l;)Z
    .locals 3

    .prologue
    invoke-virtual {p1}, Ll4/l;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll4/l;->l()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk5/z;

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Crashlytics report successfully enqueued to DataTransport: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lk5/z;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lk5/z;->c()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Deleted report file: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lh5/g;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Crashlytics could not delete report file: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lh5/g;->k(Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Crashlytics report could not be enqueued to DataTransport"

    invoke-virtual {p1}, Ll4/l;->k()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lh5/g;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method

.method private u(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;JZ)V
    .locals 12

    .prologue
    move-object v0, p0

    move-object v1, p3

    const-string v2, "crash"

    move-object/from16 v6, p4

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, Lk5/Z;->a:Lk5/y;

    const/4 v9, 0x4

    const/16 v10, 0x8

    move-object v4, p1

    move-object v5, p2

    move-wide/from16 v7, p5

    move/from16 v11, p7

    invoke-virtual/range {v3 .. v11}, Lk5/y;->d(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;JIIZ)Ln5/F$e$d;

    move-result-object v3

    invoke-direct {p0, v3}, Lk5/Z;->e(Ln5/F$e$d;)Ln5/F$e$d;

    move-result-object v3

    if-nez p7, :cond_0

    iget-object v4, v0, Lk5/Z;->g:Ll5/f;

    iget-object v4, v4, Ll5/f;->b:Ll5/e;

    new-instance v5, Lk5/Y;

    invoke-direct {v5, p0, v3, p3, v2}, Lk5/Y;-><init>(Lk5/Z;Ln5/F$e$d;Ljava/lang/String;Z)V

    invoke-virtual {v4, v5}, Ll5/e;->g(Ljava/lang/Runnable;)Ll4/l;

    return-void

    :cond_0
    iget-object v4, v0, Lk5/Z;->b:Lq5/e;

    invoke-virtual {v4, v3, p3, v2}, Lq5/e;->y(Ln5/F$e$d;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public k(Ljava/lang/String;Ljava/util/List;Ln5/F$a;)V
    .locals 2

    .prologue
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "SessionReportingCoordinator#finalizeSessionWithNativeEvent"

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk5/K;

    invoke-interface {v1}, Lk5/K;->c()Ln5/F$d$b;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lk5/Z;->b:Lq5/e;

    invoke-static {}, Ln5/F$d;->a()Ln5/F$d$a;

    move-result-object v1

    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ln5/F$d$a;->b(Ljava/util/List;)Ln5/F$d$a;

    move-result-object v0

    invoke-virtual {v0}, Ln5/F$d$a;->a()Ln5/F$d;

    move-result-object v0

    invoke-virtual {p2, p1, v0, p3}, Lq5/e;->l(Ljava/lang/String;Ln5/F$d;Ln5/F$a;)V

    return-void
.end method

.method public l(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lk5/Z;->b:Lq5/e;

    invoke-virtual {v0, p3, p1, p2}, Lq5/e;->k(Ljava/lang/String;J)V

    return-void
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, Lk5/Z;->b:Lq5/e;

    invoke-virtual {v0}, Lq5/e;->r()Z

    move-result v0

    return v0
.end method

.method public r()Ljava/util/SortedSet;
    .locals 1

    iget-object v0, p0, Lk5/Z;->b:Lq5/e;

    invoke-virtual {v0}, Lq5/e;->p()Ljava/util/SortedSet;

    move-result-object v0

    return-object v0
.end method

.method public s(Ljava/lang/String;J)V
    .locals 1

    iget-object v0, p0, Lk5/Z;->a:Lk5/y;

    invoke-virtual {v0, p1, p2, p3}, Lk5/y;->e(Ljava/lang/String;J)Ln5/F;

    move-result-object p1

    iget-object p2, p0, Lk5/Z;->b:Lq5/e;

    invoke-virtual {p2, p1}, Lq5/e;->z(Ln5/F;)V

    return-void
.end method

.method public v(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V
    .locals 10

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Persisting fatal event for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh5/g;->i(Ljava/lang/String;)V

    const-string v6, "crash"

    const/4 v9, 0x1

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v7, p4

    invoke-direct/range {v2 .. v9}, Lk5/Z;->u(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;JZ)V

    return-void
.end method

.method public w(Ljava/lang/String;Ljava/util/List;Lm5/e;Lm5/n;)V
    .locals 3

    .prologue
    invoke-direct {p0, p1, p2}, Lk5/Z;->m(Ljava/lang/String;Ljava/util/List;)Landroid/app/ApplicationExitInfo;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "No relevant ApplicationExitInfo occurred during session: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lh5/g;->i(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lk5/Z;->a:Lk5/y;

    invoke-static {p2}, Lk5/Z;->g(Landroid/app/ApplicationExitInfo;)Ln5/F$a;

    move-result-object p2

    invoke-virtual {v0, p2}, Lk5/y;->c(Ln5/F$a;)Ln5/F$e$d;

    move-result-object p2

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Persisting anr for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    invoke-direct {p0, p2, p3, p4}, Lk5/Z;->d(Ln5/F$e$d;Lm5/e;Lm5/n;)Ln5/F$e$d;

    move-result-object p2

    invoke-direct {p0, p2, p4}, Lk5/Z;->f(Ln5/F$e$d;Lm5/n;)Ln5/F$e$d;

    move-result-object p2

    iget-object p3, p0, Lk5/Z;->b:Lq5/e;

    const/4 p4, 0x1

    invoke-virtual {p3, p2, p1, p4}, Lq5/e;->y(Ln5/F$e$d;Ljava/lang/String;Z)V

    return-void
.end method

.method public x()V
    .locals 1

    iget-object v0, p0, Lk5/Z;->b:Lq5/e;

    invoke-virtual {v0}, Lq5/e;->i()V

    return-void
.end method

.method public y(Ljava/util/concurrent/Executor;)Ll4/l;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lk5/Z;->z(Ljava/util/concurrent/Executor;Ljava/lang/String;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method public z(Ljava/util/concurrent/Executor;Ljava/lang/String;)Ll4/l;
    .locals 5

    .prologue
    iget-object v0, p0, Lk5/Z;->b:Lq5/e;

    invoke-virtual {v0}, Lq5/e;->w()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk5/z;

    if-eqz p2, :cond_1

    invoke-virtual {v2}, Lk5/z;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    iget-object v3, p0, Lk5/Z;->c:Lr5/b;

    invoke-direct {p0, v2}, Lk5/Z;->j(Lk5/z;)Lk5/z;

    move-result-object v2

    if-eqz p2, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v3, v2, v4}, Lr5/b;->c(Lk5/z;Z)Ll4/l;

    move-result-object v2

    new-instance v3, Lk5/X;

    invoke-direct {v3, p0}, Lk5/X;-><init>(Lk5/Z;)V

    invoke-virtual {v2, p1, v3}, Ll4/l;->h(Ljava/util/concurrent/Executor;Ll4/c;)Ll4/l;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v1}, Ll4/o;->f(Ljava/util/Collection;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
