.class public abstract LR0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR0/h$a;,
        LR0/h$b;
    }
.end annotation


# static fields
.field public static final b:LR0/h$a;

.field private static final c:LR0/E;

.field private static final d:LR0/u;

.field private static final e:LR0/u;

.field private static final f:LR0/u;

.field private static final g:LR0/u;


# instance fields
.field private final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LR0/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LR0/h$a;-><init>(Ly7/k;)V

    sput-object v0, LR0/h;->b:LR0/h$a;

    new-instance v0, LR0/f;

    invoke-direct {v0}, LR0/f;-><init>()V

    sput-object v0, LR0/h;->c:LR0/E;

    new-instance v0, LR0/u;

    const-string v1, "sans-serif"

    const-string v2, "FontFamily.SansSerif"

    invoke-direct {v0, v1, v2}, LR0/u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LR0/h;->d:LR0/u;

    new-instance v0, LR0/u;

    const-string v1, "serif"

    const-string v2, "FontFamily.Serif"

    invoke-direct {v0, v1, v2}, LR0/u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LR0/h;->e:LR0/u;

    new-instance v0, LR0/u;

    const-string v1, "monospace"

    const-string v2, "FontFamily.Monospace"

    invoke-direct {v0, v1, v2}, LR0/u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LR0/h;->f:LR0/u;

    new-instance v0, LR0/u;

    const-string v1, "cursive"

    const-string v2, "FontFamily.Cursive"

    invoke-direct {v0, v1, v2}, LR0/u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LR0/h;->g:LR0/u;

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LR0/h;->a:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLy7/k;)V
    .locals 0

    invoke-direct {p0, p1}, LR0/h;-><init>(Z)V

    return-void
.end method

.method public static final synthetic a()LR0/E;
    .locals 1

    sget-object v0, LR0/h;->c:LR0/E;

    return-object v0
.end method

.method public static final synthetic b()LR0/u;
    .locals 1

    sget-object v0, LR0/h;->d:LR0/u;

    return-object v0
.end method
