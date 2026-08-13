.class public final Lj8/a;
.super Lk8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj8/a$a;
    }
.end annotation


# static fields
.field public static final g:Lj8/a$a;

.field public static final h:Lj8/a;

.field public static final i:Lj8/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lj8/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj8/a$a;-><init>(Ly7/k;)V

    sput-object v0, Lj8/a;->g:Lj8/a$a;

    new-instance v0, Lj8/a;

    const/4 v1, 0x7

    const/4 v2, 0x1

    const/4 v3, 0x0

    filled-new-array {v2, v3, v1}, [I

    move-result-object v1

    invoke-direct {v0, v1}, Lj8/a;-><init>([I)V

    sput-object v0, Lj8/a;->h:Lj8/a;

    new-instance v0, Lj8/a;

    new-array v1, v3, [I

    invoke-direct {v0, v1}, Lj8/a;-><init>([I)V

    sput-object v0, Lj8/a;->i:Lj8/a;

    return-void
.end method

.method public varargs constructor <init>([I)V
    .locals 1

    const-string v0, "numbers"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-direct {p0, p1}, Lk8/a;-><init>([I)V

    return-void
.end method


# virtual methods
.method public h()Z
    .locals 1

    sget-object v0, Lj8/a;->h:Lj8/a;

    invoke-virtual {p0, v0}, Lk8/a;->f(Lk8/a;)Z

    move-result v0

    return v0
.end method
