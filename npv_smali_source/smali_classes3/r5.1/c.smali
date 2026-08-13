.class public final synthetic Lr5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW2/j;


# instance fields
.field public final synthetic a:Lr5/e;

.field public final synthetic b:Ll4/m;

.field public final synthetic c:Z

.field public final synthetic d:Lk5/z;


# direct methods
.method public synthetic constructor <init>(Lr5/e;Ll4/m;ZLk5/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/c;->a:Lr5/e;

    iput-object p2, p0, Lr5/c;->b:Ll4/m;

    iput-boolean p3, p0, Lr5/c;->c:Z

    iput-object p4, p0, Lr5/c;->d:Lk5/z;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Lr5/c;->a:Lr5/e;

    iget-object v1, p0, Lr5/c;->b:Ll4/m;

    iget-boolean v2, p0, Lr5/c;->c:Z

    iget-object v3, p0, Lr5/c;->d:Lk5/z;

    invoke-static {v0, v1, v2, v3, p1}, Lr5/e;->a(Lr5/e;Ll4/m;ZLk5/z;Ljava/lang/Exception;)V

    return-void
.end method
