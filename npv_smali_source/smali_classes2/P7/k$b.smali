.class final LP7/k$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP7/k;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LP7/k$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP7/k$b;

    invoke-direct {v0}, LP7/k$b;-><init>()V

    sput-object v0, LP7/k$b;->D:LP7/k$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LP7/g;)LR8/h;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lj7/v;->Y(Ljava/lang/Iterable;)LR8/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LP7/g;

    invoke-virtual {p0, p1}, LP7/k$b;->a(LP7/g;)LR8/h;

    move-result-object p1

    return-object p1
.end method
