.class final LF8/F$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LF8/F$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF8/F$a;

    invoke-direct {v0}, LF8/F$a;-><init>()V

    sput-object v0, LF8/F$a;->D:LF8/F$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LG8/g;)Ljava/lang/Void;
    .locals 1

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG8/g;

    invoke-virtual {p0, p1}, LF8/F$a;->a(LG8/g;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
