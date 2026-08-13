.class final Laa/o$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/o;->f(Laa/m;Laa/n;)Laa/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Laa/o$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laa/o$f;

    invoke-direct {v0}, Laa/o$f;-><init>()V

    sput-object v0, Laa/o$f;->D:Laa/o$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Laa/q;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Laa/q;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Laa/q;

    invoke-virtual {p0, p1}, Laa/o$f;->a(Laa/q;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
