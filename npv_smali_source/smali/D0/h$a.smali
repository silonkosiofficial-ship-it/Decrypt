.class public final LD0/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LD0/h$a;

.field private static final b:LD0/h;

.field private static final c:LD0/h;

.field private static final d:LD0/h;

.field private static final e:LD0/h;

.field private static final f:LD0/h;

.field private static final g:LD0/k;

.field private static final h:LD0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LD0/h$a;

    invoke-direct {v0}, LD0/h$a;-><init>()V

    sput-object v0, LD0/h$a;->a:LD0/h$a;

    new-instance v0, LD0/h$a$a;

    invoke-direct {v0}, LD0/h$a$a;-><init>()V

    sput-object v0, LD0/h$a;->b:LD0/h;

    new-instance v0, LD0/h$a$e;

    invoke-direct {v0}, LD0/h$a$e;-><init>()V

    sput-object v0, LD0/h$a;->c:LD0/h;

    new-instance v0, LD0/h$a$c;

    invoke-direct {v0}, LD0/h$a$c;-><init>()V

    sput-object v0, LD0/h$a;->d:LD0/h;

    new-instance v0, LD0/h$a$d;

    invoke-direct {v0}, LD0/h$a$d;-><init>()V

    sput-object v0, LD0/h$a;->e:LD0/h;

    new-instance v0, LD0/h$a$f;

    invoke-direct {v0}, LD0/h$a$f;-><init>()V

    sput-object v0, LD0/h$a;->f:LD0/h;

    new-instance v0, LD0/k;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1}, LD0/k;-><init>(F)V

    sput-object v0, LD0/h$a;->g:LD0/k;

    new-instance v0, LD0/h$a$b;

    invoke-direct {v0}, LD0/h$a$b;-><init>()V

    sput-object v0, LD0/h$a;->h:LD0/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LD0/h;
    .locals 1

    sget-object v0, LD0/h$a;->c:LD0/h;

    return-object v0
.end method

.method public final b()LD0/h;
    .locals 1

    sget-object v0, LD0/h$a;->f:LD0/h;

    return-object v0
.end method
